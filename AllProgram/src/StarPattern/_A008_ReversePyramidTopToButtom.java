package StarPattern;

public class _A008_ReversePyramidTopToButtom 
{
	public static void main(String[] args) 
	{
		int size=5;
		for(int i=1;i<=size;i++)
		{
			for(int j=1; j<=size;j++)
			{
				if(j>=i)
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			
			
			for(int k=1; k<=size;k++)
			{
				if(i+k<size+1)
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
