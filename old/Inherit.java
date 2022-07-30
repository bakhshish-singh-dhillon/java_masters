class a
{
void show()
{
int sum=0,j=0;
int a[]=new int[10];
for(int i=0;i<10;i++)
{
a[i]=j++;
}
for(int i=0;i<10;i++)
{
sum=sum+a[i];
}
System.out.println("sum is:"+sum);
}
}


class c extends a
{
void prints()
{
show();
}
}


class Inherit
{
public static void main(String args[])
{
c obj=new c();
obj.prints();
}
}