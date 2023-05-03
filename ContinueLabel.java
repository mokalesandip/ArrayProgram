
public class ContinueLabel {

	public static void main(String[] args) 
	{
		ONE:for(int i=1;i<=3;i++)
		{
			TWO:for(int j=1;j<=10;j++)
			{
				if(j==5)
				continue TWO;
				System.out.println(j);
			}
		}

	}

}
