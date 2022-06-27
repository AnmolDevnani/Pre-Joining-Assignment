// Java program for exception handling and handling exceptions

class ExceptionPrac
{
public static void main(String args[])
{
try {
	int n1 = Integer.parseInt(args[0]);
	int n2 = Integer.parseInt(args[1]);
	int res = n1 / n2;
	System.out.println("Res = " + res);
}

catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
System.out.println("Please enter two integers ");
}

catch(ArithmeticException e) {
System.out.println("division by zero not allowed ");
}

}
}