public class LocalVar 
{
public void pupAge() {
// local variables are used here
int age = 0;
age = age + 5;
System.out.println("Puppy age = " + age);
}

public static void main(String args[])
{
LocalVar test = new LocalVar();
test.pupAge();
}
}

	