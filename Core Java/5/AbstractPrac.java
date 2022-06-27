// Java Program to explain how abstract method works
abstract class Meeting 
{

public abstract void changeId();

public void mikeOnOff() 
{
System.out.println("I will do it ");
}
}

class Participant extends Meeting 
{

public void changeId() 
{
System.out.println("Participant will do it ");
}
}

class AbstractPrac 
{
public static void main(String args[])
{
Participant p = new Participant();
p.mikeOnOff();
p.changeId();
}
}