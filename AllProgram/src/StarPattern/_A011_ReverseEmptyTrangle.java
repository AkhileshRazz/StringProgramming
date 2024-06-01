package StarPattern;

public class _A011_ReverseEmptyTrangle 
{
	public static void main(String[] args) 
	{
		int size=5;
		for(int i=1;i<=size;i++)
		{
			for(int j=1; j<=2*size-1;j++)
			{
				if(i==j || i+j==size*2 || i==1)
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
