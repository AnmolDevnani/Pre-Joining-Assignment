// Java program to show method overloading
class A 
{

public void add(int a, int b)
{
int res = a + b;
System.out.println("a + b = " + res);
}
}

class B extends A
{

public void add(int a, int b, int c)
{
int res = a + b + c;
System.out.println("a + b + c = " + res);
}
}

class OverloadingPrac 
{
public static void main(String args[])
{
B res = new B();
res.add(2,3);
res.add(2,3,4);
}
}
