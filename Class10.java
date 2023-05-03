import java.util.Scanner;

//Display array element like an array
public class Class10 
{
	void displayElements(int[] x)
	{
		System.out.print("[");
		for(int y:x)
		{
			System.out.print(y+",");
		}
		System.out.print("]");
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter "+n+" Elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Class10 obj=new Class10();
		obj.displayElements(a);
		}

}
