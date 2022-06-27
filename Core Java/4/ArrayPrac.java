// Java program to store a student's marks in array and find the average

import java.io.*;
class ArrayPrac 
{
public static void main(String args[])
{

Console c = System.console();
int n = Integer.parseInt(c.readLine("Enter total number of students "));
int marks[] = new int[n];

for(int i = 0; i < n ; i++ )
	marks[i] = Integer.parseInt(c.readLine("Enter marks " ));

for(int i : marks)
	System.out.println(i);

double sum = 0;

for(int i = 0; i < n ; i++)
	sum = sum + marks[i];

double avg = sum / n;

System.out.println("Avg = " + avg);

}
}


