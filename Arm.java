import java.util.Scanner;
class Arm
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int num=sc.nextInt();
int temp,arm=0;
temp=num;
while(temp!=0)
{
arm=arm+(int)(Math.pow((temp%10),3));
temp=temp/10;
}
if(arm==num)
{
System.out.println(num+" is Armstrong");
}
else
{
System.out.println(num+" is not Armstrong");
}
}
}