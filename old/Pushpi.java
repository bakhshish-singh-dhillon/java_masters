import java.util.Scanner;
class Pushpi
{
public static void main(String args[])
{
System.out.print("Enter full name of Pushpi Veera:");
Scanner pooraName=new Scanner(System.in);
String veera=pooraName.nextLine();
for(int i=0;i<4;i++)
{
System.out.print("Happy Birthday ");
if(i==2)
{
System.out.println("Dear "+veera+" Best Teacher/Friend Ever");
continue;
}
System.out.println("To You");
}
}
}

