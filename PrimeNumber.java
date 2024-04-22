
import java.util.Scanner;
import java.util.ArrayList;

public class PrimeNumber
{
public static void main(String[]args)
{
 Scanner sc3 = new Scanner(System.in);
 System.out.println("Numbers range starting from ");
 int p1 =sc3.nextInt();
 Scanner sc4 = new Scanner(System.in);
 System.out.println("Numbers range ending with ");
 int p2 =sc4.nextInt();
 ArrayList<Integer> prime = new ArrayList<Integer>();
 
 int j = 0;
  for(int i = p1; i<=p2; i++)
  {
  for( j = 2 ;j<=i;j++)
  {
  if(i%j==0)
  {
  break;
  }
  }
  if(i==j)
  {
	 
  System.out.println(j);
  }
  }
  }
  }