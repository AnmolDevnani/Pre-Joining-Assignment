// Java program to show interface

interface Meeting 
{

public abstract void changeId();
public void mikeOnOff(); 

}

class Participant implements Meeting 
{

public void changeId() 
{
System.out.println("Participant will do it ");
}

public void mikeOnOff()
{
System.out.println("Participant will do it ");
}
}

class InterfacePrac 
{
public static void main(String args[])
{
Participant p = new Participant();
p.mikeOnOff();
p.changeId();
}
}