//to pass an array to a method
public class Class3 
{
	void displayElement(int[] x)
	{
		for(int y:x)
		{
			System.out.println(y);
		}
	}

	public static  void main(String[] args)
	{
		int[] a={23,93,23,45,32,13};
		Class3 obj=new Class3();
		obj.displayElement(a);
		

	}

}
