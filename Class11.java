//write a java program to print/find maximum and minimum element
import java.util.Scanner;

public class Class11 
{
	int minimum(int[] x)
	{
		int min=x[0];
		for(int y:x)
		{
			if(min>y)
				min=y;
		}
		return min;
		}
	int maximum(int[] x)
	{
	int max=x[0];
	for(int m:x)
	{
		if(max<m)
			max=m;
	}
	return max;
}


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter "+n+" Element: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Class11 obj=new Class11();
		int b=obj.minimum(a);
		int c=obj.maximum(a);
		System.out.println(b);
		System.out.println(c);
		}

				
	}


