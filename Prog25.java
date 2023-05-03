import java.util.Scanner;

/*  Program-25
Define a method which accepts a value as number and returns the sum of factors of the value.
Write the method with the following specifications: 
Name of method getSumOfFactors() // which accepts an integer value as argument and return a String.
Arguments: one argument of type integer
Return Type: integer value
Specifications: The value returned by the method getSumOfFactors() is determined by the following rules:
Value must not be negative. If yes, then return   -1             
Value must not be 0. If yes, then return -2. */
public class Prog25
{
	int getSumOfFactors(int n)
	{
		int i,s=0;
		if(n<0)
			return -1;
		else if(n==0)
			return -2;
		else
		{
		
			for(i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					s=s+i;
				}
			}
			return s;
				
			
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Prog25 obj=new Prog25();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int x=sc.nextInt();
		int y=obj.getSumOfFactors(x);
		if(y>0)
			System.out.println("Sum Of Factors Are "+y);
		else
			System.out.println(y);

	}

}
