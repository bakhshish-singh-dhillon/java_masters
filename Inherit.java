class A 
{
public void A()
{
System.out.println("Constructor of class A");
}
}
class B extends A 
{
public B()
{
super();
System.out.println("Constructor of Class B");
}
}
class C extends B 
{
public C()
{
super();
System.out.println("Constructor of Class C");
}
}
class Inherit extends A
{
public static void main(String args[])
{
System.out.println("Class A and B - Single Inheritance");
System.out.println("Class A,B,C - MultiLevel Inheritance");
System.out.println("Class A,B and A,Inherit - Hierarchical Inheritance");
C obj=new C();
}
}