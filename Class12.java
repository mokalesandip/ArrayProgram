import java.util.Scanner;

public class Class12 
{
	void add(int[][] x, int[][] y) 
	{
		if((x.length!=y.length)||(x[0].length!=y[0].length))
		{
			System.out.println("Addiition not possible");
		}
		else
		{
			int[][] z=new int[x.length][x[0].length];
			for(int i=0;i<z.length;i++)
			{
				for(int j=0;j<z[i].length;j++)
				{
					z[i][j]=x[i][j]+y[i][j];
				}
			}
			for(int i=0;i<z.length;i++)
			{
				for(int j=0;j<z[i].length;j++)
				{
					System.out.print(z[i][j]+" ");
				}
				System.out.println();
				
			}
			
		}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row and cols of first array: ");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int[][] a=new int[r1][c1];
		System.out.print("Enter row and  cols of second array: ");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int[][] b=new int[r2][c2];
		System.out.print("Enter "+r1*c1+" Element: ");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.print("Enter "+r2*c2+" Element: ");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		Class12 d=new Class12();
		d.add(a,b);
		
	}

}
