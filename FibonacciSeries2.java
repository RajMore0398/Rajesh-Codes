public class FibonacciSeries2
{
public static void main(String[]args)
{
int a=0,b=1,c;
int endingValue =20;
for(int i =1;i<=endingValue;i++)
{
System.out .println(a+ " ");
c =a+b;
a=b;
b=c;
}
}
}