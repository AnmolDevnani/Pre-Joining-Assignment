// Using Instance Variables

public class Employee
{

// Declaring instance variables
public String name;
private double salary;

public Employee(String name, double salary)
{
this.name = name;
this.salary = salary;
}

public void showData()
{
System.out.println("Name = " + name);
System.out.println("Salary = " + salary);
}

public static void main(String args[]) 
{
Employee e = new Employee("Amit" , 10000);
e.showData();
}

}