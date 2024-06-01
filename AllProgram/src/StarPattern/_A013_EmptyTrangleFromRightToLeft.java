package StarPattern;

public class _A013_EmptyTrangleFromRightToLeft 
{
	public static void main(String[] args) 
	{
		int size=5;
		for(int i=1;i<=2*size-1;i++)
		{
			for(int j=1; j<=size;j++)
			{
				if(i-j==size-1 || i+j==size+1 || j==size)
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
