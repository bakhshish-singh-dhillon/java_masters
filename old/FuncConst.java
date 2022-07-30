class FuncConst
{
FuncConst()
{
System.out.println("Default");
}
FuncConst(int a)
{
System.out.println("Parameterized"+a);
}
FuncConst(int a,int b)
{
System.out.println("Parameterized"+a);
}
void sum(int a)
{
System.out.println("Sum is:"+(a+a));
}
void sum(int a,int b)
{
System.out.println("Sum is:"+(a+b));
}
void sum(int a,int b,int c)
{
System.out.println("Sum is:"+(a+b+c));
}

public static void main(String args[])
{
new FuncConst();
new FuncConst(1);
FuncConst fc=new FuncConst(2,1);
fc.sum(5);
fc.sum(5,7);
fc.sum(5,7,9);
}
}