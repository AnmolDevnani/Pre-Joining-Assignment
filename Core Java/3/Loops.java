// Program to find the sum of first n natural numbers using for, while and do-while loop

class Loops 
{
public static void main(String args[])
{
int sum1 = 0,sum2 = 0,sum3 = 0;
int n = Integer.parseInt(args[0]);

if(n < 1)
	System.out.println("Invalid input");
else
{

for(int i = 1; i <= n; i++)
{
sum1 = sum1 + i;
}

int i = 1;
while(i <= n)
{
sum2 = sum2 + i;
i++;
}

int j = 1;
do {
sum3 = sum3 + j;
j++;
} while( j <= n);


System.out.println("Sum 1 = " + sum1); 
System.out.println("Sum 2 = " + sum2); 
System.out.println("Sum 3 = " + sum3); 

}
}
}