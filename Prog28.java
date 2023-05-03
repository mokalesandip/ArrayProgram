import java.util.Scanner;

/* Program-28
Define a method which accepts 2 values as number and returns the prime numbers between the values.
Write the method with the following specifications: 
Name of method: getPrimeNumbers() 
Arguments: two arguments of type integers
Return Type: String value 
Specifications: The value returned by the method getPrimeNumbers() is determined by the following rules:
Value must not be negative. If yes, then return -1 as string.                                                               
1st value must not be greater than or equal to 2nd value. If yes, then return -2 as string.                                       
Prime Numbers must be returned as one string with every value separated by single blank space. */
public class Prog28 
{
	String getPrimeNumbers(int x,int y)
	{
		String s="";
		if(x<0 || y<0)
		{
			s=s+-1;
			return s;
		}
		else if(x>y && x==y)
		{
			s=s+-2;
			return s;
		}
		else
		{
			int i,j,c=0;
			for(i=1;i<=x;i++)
			{
				for(j=0;j<=y;j++)
				{
					if(x%i==0)
					{
						c++;
					}
				}
					if(c==2)
					
						s=s+i;
			}
					
			return s;
			}
		}
		
	

	public static void main(String[] args) 
	{
		Prog28 obj=new Prog28();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		String r=obj.getPrimeNumbers(a,b);
		System.out.println(r);

	}

}
