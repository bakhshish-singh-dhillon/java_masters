import java.util.Scanner;
class Construct
{
Construct(int num1,int num2,int num3)
{
if(num1>num2)
{
if(num1>num3)
{
System.out.println(num1+" is greatest");
}
else
{
System.out.println(num3+" is greatest");
}
}
else
{
if(num2>num3)
{
System.out.println(num2+" is greatest");
}
else
{
System.out.println(num3+" is greatest");
}
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Three Numbers");
int num1=sc.nextInt();
int num2=sc.nextInt();
int num3=sc.nextInt();
new Construct(num1,num2,num3);
}
}