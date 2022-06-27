import java.util.*;

class Student implements Comparable<Student> {
int rno;
String name;

Student(int rno, String name){
this.rno = rno;
this.name = name;
}

public String toString() {
return rno + " " + name;
}

public int compareTo(Student s) {
	return rno - s.rno;
}

public boolean equals(Object o) {
	Student s = (Student)o;
	return rno == s.rno;
}

public int hashCode() {
	return rno;
}
}

class Set1 {
public static void main(String args[]) {
Student s1 = new Student(10,"amit");			//constructor
Student s2 = new Student(20,"sumit");
Student s3 = new Student(10,"aman");
Student s4 = new Student(20,"rumit");
Student s5 = new Student(30,"anil");
Student s6 = new Student(40,"seema");
Student s7 = new Student(20,"rumit");

TreeSet<Student> s = new TreeSet<>();
s.add(s1);						// equals() and hashCode()
s.add(s2);
s.add(s3);
s.add(s4);
s.add(s5);
s.add(s6);
s.add(s7);



for(Student p : s)
	System.out.println(p);			// toString()
}
}

  