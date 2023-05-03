//Program to return an array from method
public class Class4 
{
	int[] getElements()
	{
		int[] a=new int[] {23,93,52,45,34};
		return a;
	}

	public static void main(String[] args)
	{
		Class4 obj=new Class4();
		int[] x=obj.getElements();
		for(int y:x)
		{
			System.out.println(y);
		}

	}

}
