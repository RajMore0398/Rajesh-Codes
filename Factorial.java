import java.util.Scanner;
public class Factorial
{
public static void main(String[]args)
{
Scanner sc2 = new Scanner(System.in);
System.out.println("Please enter the no you want ");
int n = sc2.nextInt();
int f = 1;
for(int i=n; i>0;i--)
{
f=f*i;
}
System.out.println("value  is "+f);
}
}
 
