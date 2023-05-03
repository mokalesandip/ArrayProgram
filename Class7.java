import java.util.Scanner;

//to add array element
public class Class7 
{
	int addElements(int[] x)
	{
		int sum=0;
		for(int y:x)
		{
			sum=sum+y;
		}
		return sum;
		}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter "+n+" Element: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Class7 obj=new Class7();
		int b=obj.addElements(a);
		System.out.println(b);
		}

	}


