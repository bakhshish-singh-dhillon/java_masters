import java.util.*;
public class Vectors
{
public static void main(String args[]) throws Exception
{
Vector v = new Vector(3, 2);
System.out.println("Initial size: " + v.size());
System.out.println("Initial capacity: " + v.capacity());
      
v.addElement(new Integer(1));
v.addElement(new Integer(2));
v.addElement(new Integer(3));
v.addElement(new Integer(4));
System.out.println("Capacity after four additions: " + v.capacity());
      
v.addElement(9.4);
v.addElement(10);
System.out.println("Current capacity: " + v.capacity());
      
v.addElement("Hello");
v.addElement(12);
System.out.println("First element: " + (Integer)v.firstElement());
System.out.println("Last element: " + (Integer)v.lastElement());
            
Enumeration ve = v.elements();
System.out.println("Elements in vector:");
      
while(ve.hasMoreElements())
System.out.print(ve.nextElement() + " ");
}
}