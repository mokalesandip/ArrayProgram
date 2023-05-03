import java.util.Scanner;

/*  Program-26
Define a method which accepts 2 values as number and returns the even numbers between the 2 values.
Write the method with the following specifications
Name of method getEvenNumbers() // which accepts 2 integer values as arguments and return the even numbers between the range.
Arguments: Two arguments of type integer
Return Type: String value
Note: If the first argument value is greater than second value, generate even numbers from first value to second value.
 If the second value is less than first value, generate even numbers from second value to first.
Specifications: The value returned by the method getEvenNumbers() is determined by the following rules
Values must not be negative. If yes, then return   -1 as string.                                                   
Value must not be 0 or same. If yes, then return -2 as string.                                            
The values must be returned as a single string  where each value is separated by a single blank space.
For Example:
Input: 10 20
Output: 10 12 14 16 18 20
Input: 20 10
Output: 10 12 14 16 18 20  */
public class Prog26 
{
	String getEvenNumbers(int a,int b)
	{
		int i;
		String s="";
		if(a<0 || b<0)
			s=s+-1;
		else if(a==0 || b==0 || a==b)
			s=s+-2;
		else if(a<b)
		{
			if(a%2==0)
			{
				
				for(i=1;a<=b;i++)
				{
					s=s+a+" ";
					a=a+2;
				}
				return s;
			}
			else
			{
				a=a+1;
				for(i=1;a<=b;i++)
				{
					s=s+a+" ";
					a=a+2;
				}
				return s;
			}
		}
		else if(a>b)
		{
			if(b%2==0)
			{
				for(i=1;b<=a;i++)
				{
					s=s+b+" ";
					b=b+2;
				}
				return s;
			}
			else
			{
				b=b+1;
				for(i=1;b<=a;i++)
				{
					s=s+b+" ";
					b=b+2;
				}
				return s;
			}
		}
		return s;
				
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Prog26 obj=new Prog26();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		String z=obj.getEvenNumbers(x,y);
		System.out.println(z);

	}

}
