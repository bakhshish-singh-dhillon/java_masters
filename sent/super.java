class a
{
static int x,y;
a(int a,int c)
{
x=a;
y=c;
}
void prints()
{
System.out.println("class a");
}
}

class b extends a
{
b()
{
super(40,50);
System.out.println("Sum is:"+(x+y));
}
void prints()
{
super.prints();
System.out.println("class b");
}

}
class Supers
{
public static void main(String args[])
{
b obj=new b();
obj.prints();
}
}