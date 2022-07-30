class Over
{
void sum(int a,int b)
{
System.out.println("Overridden Function");
}
}
class Poly extends Over
{
Poly()
{
System.out.println("Constructor:1");
}
Poly(int a)
{
System.out.println("Constructor:2");
}
void sum(int a, int b)
{
super.sum(4,5);
System.out.println("Sum is:"+(a+b));
}
void sum (int a,int b,int c)
{
System.out.println("Sum is:"+(a+b+c));
}
public static void main(String args[])
{
Poly obj =new Poly();
obj.sum(5,6);
obj.sum(7,8,9);
new Poly(5);
}
}