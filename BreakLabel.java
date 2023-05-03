
public class BreakLabel {

	public static void main(String[] args)
	{
		FIRST:for(int i=1;i<=3;i++)
		{
			SECOND:for( int j=1;j<=10;j++)
			{
				if(j==5)
					break FIRST;
						System.out.println(j);
			}
		}
		

	}

}
