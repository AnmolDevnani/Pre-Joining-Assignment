// wamdoojp for maintaining list of students

import java.io.*;
import java.util.*;

class Student {
public int rno;
private String name;

public Student(int rno , String name) {
this.rno = rno;
this.name = name;
}

public String toString() {
return rno + " " + name;
}
}

class List2 {
public static void main(String args[]) {
Console c = System.console();
ArrayList<Student> stu = new ArrayList<>();

while(true) 
{

	int op = Integer.parseInt(c.readLine(" 1. add student 2. view student 3. remove student and 4. exit "));
	if (op == 1){
		int rno = Integer.parseInt(c.readLine("enter rno "));
		String name = c.readLine("enter yuor name ");
		Student s = new Student(rno , name);
		stu.add(s);
		System.out.println("record added");
	} else if (op == 2 ){
		for (Student m : stu)
			System.out.println(m);
	} else if(op == 3 ){
		boolean found = false;
		int r = Integer.parseInt(c.readLine("enter the rno to be deleted"));
		for (Student p : stu) {
			if(p.rno == r) {
				stu.remove(p);
				found = true;
				System.out.println(r + " removed");
				break;
			}
		}
		if( ! found) 
			System.out.println(r + " does not exists");
	} else if(op == 4 ) {
		break;
	} else {
		System.out.println("invalid option");
	}

} //end of while
} // end of main
} //end of class