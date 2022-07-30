class CmdArray
{
public static void main(String args[])
{
int sum=0;
int a[]=new int[10];
for(int i=0;i<10;i++)
{
a[i]=Integer.parseInt(args[i]);
}
for(int i=0;i<10;i++)
{
sum=sum+a[i];
}
System.out.println("sum is:"+sum);
}
}