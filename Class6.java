import java.util.Scanner;

//Program to accept and display array element
public class Class6 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter "+n+"Elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int b:a)
		{
			System.out.println(b);
		}

	}

}
