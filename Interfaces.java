interface A 
{
public void display();
}
class Interfaces implements A
{
public void display()
{
System.out.println("Overriden Abstarct Interface Function");
}
public static void main(String args[])
{
Interfaces obj=new Interfaces();
obj.display();
}
}