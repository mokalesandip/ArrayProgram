//min and max elements
import java.util.Scanner;

public class Class9 
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
	int maximum(int[] k)
	{
		int max=k[0];
		for(int l:k)
		{
			if(max<l)
				max=l;
		}
		return max;
		
	}


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		int[] a=new int[5];
		System.out.println("Enter "+n+" Elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Class9 obj=new Class9();
		int b=obj.minimum(a);
		int c=obj.maximum(a);
		System.out.println(b);
		System.out.println(c);
		}

}
