import java.util.Scanner;
public class Swapping
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the given first no ");
int x = sc.nextInt();
Scanner sc1 = new Scanner(System.in);
System.out.println("Please enter the given second no ");
int y = sc1.nextInt();
System.out.println("Value of x is "+x+ " , And value of y is "+y);
x=x+y;
y=x-y;
x=x-y;
System.out.println("After Swapping the value x  is "+x+ " , and y is" +y);
}
}