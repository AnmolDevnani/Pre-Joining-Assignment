class Rectangle {
private int length;
private int width;

// Default Constructor
public Rectangle() {
length = 0;
width = 0;
}

// Parameterized Constructor
public Rectangle(int l, int w) {
length = l;
width = w;
}

public int areaRect() {
return length * width;
}
}

class Constructors 
{
public static void main(String args[]) 
{
Rectangle rect1 = new Rectangle(20,15);
Rectangle rect2 = new Rectangle();

int a1,a2;

a1 = rect1.areaRect();
System.out.println(a1);

a2 = rect2.areaRect();
System.out.println(a2);

}
}
