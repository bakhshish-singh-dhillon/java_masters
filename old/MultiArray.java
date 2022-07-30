class MultiArray
{
public static void main(String args[])
{
int a[][]=new int[4][];
int value=0;
int sum,mul[][]=new int[4][4];
for(int i=0;i<4;i++)
{
a[i]=new int[4];
}
for(int i=0;i<4;i++)
{
for(int j=0;j<4;j++)
{
a[i][j]=value;
value++;
}
}
for(int i=0;i<4;i++)
{
for(int j=0;j<4;j++)
{
for(int k=0;k<4;k++)
{
mul[i][j]=mul[i][j]+(a[i][k]*a[k][j]);
}
}
}
for(int i=0;i<4;i++)
{
for(int j=0;j<4;j++)
{
System.out.print(mul[i][j]+" ");
}
System.out.println();
}
}
}