import java.util.Scanner;

//to find maximum of array elements
public class Class8 
{
	int maximum(int[] x)
	{
		int max=x[0];
		for(int y:x)
		{
			if(max<y)
				max=y;
		}
		return max;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter "+n+" Element : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Class8 obj=new Class8();
		int b=obj.maximum(a);
		System.out.println(b);
		}

}

