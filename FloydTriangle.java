public class FloydTriangle
{
public static void main(String[]args)
{
int c = 1;
System.out.println();
for(int i =1;i<=5;i++)
{
for(int j =1;j<=i;j++)
{
System.out.print(c+" ");
c++;
}
System.out.println();
}
}
}