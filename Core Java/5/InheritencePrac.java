// Java program to show inheritence and method overriding

class Person 
{
private String name;
private String address;

public Person(String name, String address)
{
this.name = name;
this.address = address;
}

public void show()
{
System.out.println("Name = " + name);
System.out.println("Address = " + address);
}
}

class Teacher extends Person {
private double salary;

public Teacher(String name,String address, double salary) 
{
super(name,address);
this.salary = salary;
}

public void show()
{
super.show();
System.out.println("Salary = " + salary);
}
}

class InheritencePrac
{
public static void main(String args[])
{
Teacher t = new Teacher("John","Mumbai",10000);
t.show();
}
}

 