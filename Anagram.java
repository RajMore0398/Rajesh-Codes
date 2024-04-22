import java.util.Arrays;
public class Anagram
{
public static void main(String[]args)
{
char[]a = {'L','I','S','T','E','N'};
char[]b = {'S','I','L','E','N','L'};

if(a!=null && b!=null)
{
if(a.length==b.length)
{
Arrays.sort(a);
Arrays.sort(b);
}
if(Arrays.equals(a,b))
{
System.out.println( "Are Anagrams");
}
else
{
System.out.println( "Not Anagrams");
}
}
}
}