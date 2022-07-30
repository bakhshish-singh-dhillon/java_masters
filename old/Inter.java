interface a
{
public void sum(int a, int b);
}

class inter implements a
{
public void sum(int a, int b)
{
System.out.println(a+b);
}

public static void main(String args[])
{
inter i=new inter();
i.sum(4,5);
}
}
