// Sorting the list using comparator and comparable

import java.util.*;

class Ap implements Comparator<Book> {
public int compare(Book p, Book q) {
	return (int) (p.price - q.price);
}
}

class Book implements Comparable<Book> {
int id;
String name;
double price;

Book(int id, String name, double price) {
this.id = id;
this.name = name;
this.price = price;
}

public String toString(){
return id + " " + name + " " + price;
}

public int compareTo(Book b) {
	return id - b.id;
}
}

class List3{
public static void main(String args[]) {
ArrayList<Book> b = new ArrayList<>();

Book b1 = new Book(10 , "java" , 500);						
Book b2 = new Book(20 , "android" , 400);
Book b3 = new Book(40 , "golang" , 600);
Book b4 = new Book(50 , "django" , 700);
Book b5 = new Book(15 , "python" , 300);

b.add(b1);
b.add(b2);
b.add(b3);
b.add(b4);
b.add(b5);

for(Book p : b)	
	System.out.println(p);
System.out.println();

Collections.sort(b);

for(Book p : b)	
	System.out.println(p);
System.out.println();

Collections.sort(b,new Ap());

for(Book p : b)	
	System.out.println(p);
System.out.println();

}
}
