import java.util.Scanner;

/*  Program-27
Define a method which accepts 3 values as number and checks and returns the name of the type of triangle generated.
Write the method with the following specifications: 
Name of method findTriangle() 
Arguments: three arguments of type integers
Return Type: String value 
Specifications: The value returned by the method findTriangle() is determined by the following rules:
Values must not be 0. If yes, then return -1 as string.                                                              
Values must not be negative. If yes, then return       -2 as string.                                 
Sum of two sides must be greater than the third side. If no, then return -3 as string
If itâs a triangle with valid sides, then return as string whether the triangle formed is EQUILATERAL, ISOSCELES or SCALENE.  */
public class Prog27 
{
	String findTriangle(int x,int y,int z)
	{
		String s="";
		if(x==0 || y==0 || z==0)
		{
			s=s+-1;
		return s;
		}
		else if(x<0 || y<0 || z<0)
		{
			s=s+-2;
		return s;
		}
		else if((x+y)>z && (y+z)>x && (x+z)>y)
		{
			if(x==y && y==z && z==x)
			{
				 s=s+"EQUILATERAL TRIANGLE";
				 return s;
			}
				 else if((x==y&&x!=z) || (y==z&&y!=x) || (z==x&&z!=y))
				 {
						 s=s+"ISOSCELES";
				         return s;
				 }
				 else if(x!=y && y!=z && z!=x)
				 {
					 s=s+"SCALE";
					 return s;
				 }
		}
				 else
					 s=s+-3;
			return s;
				 
				 
			}
	
				
			
		
		
	

	

	public static void main(String[] args) 
	{
		Prog27 obj=new Prog27();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		String r=obj.findTriangle(a,b,c);
		System.out.println(r);

	}

}
