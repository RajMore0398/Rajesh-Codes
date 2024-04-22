public class Palindrome
{
 public static void main(String[]args)
 {
 String r = "MAM";
 String rev = "";
 for(int i = r.length()-1; i>=0;i--)
 {
 rev=rev+r.charAt(i);
 }
 if(r.equals(rev))
 System.out.println("Is Palindrome ");
 else
 System.out.println("Not a Palindrome ");
 }
 }