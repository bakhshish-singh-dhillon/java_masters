import java.util.Scanner;
class Palin
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int num=sc.nextInt();
int temp,palin=0;
temp=num;
while(temp!=0)
{
palin=palin*10+(temp%10);
temp=temp/10;
}
if(palin==num)
{
System.out.println(num+" is Palindrome");
}
else
{
System.out.println(num+" is not Palindrome");
}
}
}