class VarInit 
{

// Initializing variables using different access modifiers
private int a  = 5;
public static int b = 10;

public int showData()
{
return a;
}

}

class AccessMod
{
public static void main(String args[])
{
System.out.println(VarInit.b);
VarInit test = new VarInit();

// Using the private variable in another class by returning it from a method
int res = test.showData();
System.out.println(res);
}

}
