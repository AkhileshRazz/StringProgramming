package StarPattern;

public class _A010_Trangle 
{
	public static void main(String[] args) 
	{
		int size=5;
		for(int i=1;i<=size;i++)
		{
			for(int j=1; j<=2*size-1;j++)
			{
				if(i+j>=size+1 && j-i<=size-1)
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
