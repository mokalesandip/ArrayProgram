
public class RemoveDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[]= {10,20,30,40,70,20,40};
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]==a[j])&&(i!=j))
				{
					System.out.println("Duplicaate element is  " +a[j]);
					//System.out.println(a[i]);
				}
			}
		}
	}

}
