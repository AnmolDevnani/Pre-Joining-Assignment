class ExceptionPrac2 {

public static void compute(int n1 , int n2) throws Exception {
if (n2 == 0 )
	throw new Exception("2nd no should not be zero");
int res = n1/n2;
System.out.println("res = " + res);
}

public static void main(String args[]) throws Exception {
int n1 = Integer.parseInt(args[0]);
int n2 = Integer.parseInt(args[1]);
compute(n1,n2);
}
}

// warning --> either handling(try catch) or declaring(throws)