public class Strings
{
public static void main(String args[])
{
String s = "HelloWorld";
int len = s.length();
System.out.println( "String Length is : " + len );

String s1 = s.concat(" all");
System.out.println("After Concat: "+s1);

System.out.println("Lower Case: "+s1.toLowerCase());
System.out.println("Upper Case: "+s1.toUpperCase());
System.out.println("String Index: "+s1.indexOf("all"));
System.out.println("Char Index: "+s1.indexOf("W"));
System.out.println("Equals: "+s1.equals(s));
}
}