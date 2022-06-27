// Java program to implement arraylist containing primitives
import java.util.*;
import java.io.*;

class List1 {
public static void main(String args[]) {
Console c = System.console();

ArrayList<Integer> marks = new ArrayList<>();

String rep = c.readLine("Would you like to enter more marks? ");
while(rep.equals("y")) {
	int m = Integer.parseInt(c.readLine("Enter marks"));
	marks.add(m);
	rep = c.readLine("Would you like to enter more marks? ");
}

System.out.println(marks);

// finding the sum and avg of marks

int sum = 0;
double avg = 0;

for(int i = 0; i < marks.size() ; i++) {
	sum = sum + marks.get(i);
}

avg = (double) sum/marks.size();

System.out.println("Sum = " + sum);
System.out.println("Avg = " + avg);

}
}
