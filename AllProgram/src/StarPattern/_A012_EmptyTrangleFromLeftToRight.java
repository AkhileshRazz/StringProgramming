package StarPattern;

public class _A012_EmptyTrangleFromLeftToRight 
{
	public static void main(String[] args) 
	{
		int size=5;
		for(int i=1;i<=2*size-1;i++)
		{
			for(int j=1; j<=size;j++)
			{
				if(i+j==size*2 || i==j || j==1)
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
