// Using switch case to find whether a number is even or odd

class DecMaking 
{
public static void main(String args[])
{

int n = Integer.parseInt(args[0]);

switch(n % 2)
{

	case 0 : System.out.println("Even");
	break;

	case 1 : System.out.println("Odd");
	break;

	case -1 : System.out.println("Odd");
	break;

}

}
}