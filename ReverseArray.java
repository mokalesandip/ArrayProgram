import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) 
	{
		//int a[]= {1,2,3,4,5};
		 
	Scanner sc=new Scanner(System.in);
	//System.out.println("Enter one array");
	//int b=sc.nextInt();
	//System.out.println(b);
	System.out.println("Enter array size: ");
	int n=sc.nextInt();
	int[] a=new int[n];
			System.out.println("Enter "+n+" Element: ");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
	int b=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==a[i-1])
		{
			int element = 5;
			a[i]=element;
			b++;
		}
		for( i=0;i<n;i++)
			System.out.println(a[i]);
		}
	}

	
}
