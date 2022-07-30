class Except
{
public static void main(String args[])
{
int arr[]=new int[3];
try
{
arr[4]=5;
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Index Out Bounds");
}
try
{
int a=5/0;
}
catch(ArithmeticException e)
{
System.out.println("Arithmetic Exception");
}
try
{
String s=null;
int l=s.length();
}
catch(NullPointerException e)
{
System.out.println("Null Pointer Exception");
}
}
}