class Test
{
void fun(int a[])
{
int b[]=new int[2];
b=a;
System.out.println(b[0]+" "+b[1]);
System.out.println(a[0]+" "+a[1]);
}
public static void main(String args[])
{
int a[]=new int[2];
a[0]=5;
a[1]=10;
Test obj= new Test();
obj.fun(a);
}
}