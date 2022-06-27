class StringPrac
{
public static void main(String args[])
{
String s1 = "Hello Amit ";
String s2 = "Hi John ";

System.out.println(s1.length());

String s3 = s1.concat(s2);
System.out.println(s3);

System.out.println(s1.substring(2));

System.out.println(s2.charAt(4));

System.out.println(s1.indexOf("o"));

System.out.println(s2.toLowerCase());

System.out.println(s1.equals(s2));

}
}