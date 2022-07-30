import java.util.Scanner;
class Circle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius");
int r=sc.nextInt();
System.out.println("Area is:"+(3.14*r*r));
System.out.println("Circumference is:"+(2*3.14*r));
}
}