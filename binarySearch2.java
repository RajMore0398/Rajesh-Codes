public class BinarySearch2
{
public static void main(String[]args)
{
int[]arr ={1,3,5,7,9,12,23,45,67,89};
int searchElement =23;
int result= binarySearch(arr,0,arr.length-1,searchElement);
System.out.println(result);
}
public static int binarySearch(int[]arr,int low,int high,int searchElement)
{
if(high>low)
{
int med =low+((high-low)/2);
if(searchElement==arr[med])
{
return med;
}
if (searchElement>arr[med])
{
return binarySearch(arr,med+1,arr.length-1,searchElement);
}
if(searchElement<arr[med])
{
return binarySearch(arr,0,med-1,searchElement);
}
}
return -1;
}
}