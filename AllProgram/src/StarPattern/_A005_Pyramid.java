package StarPattern;

public class _A005_Pyramid
{
	public static void main(String[] args) 
	{
	
		int size=6;
		for(int i=1;i<=size;i++)
		{
			for(int j=1; j<=size;j++)
			{
				if(i+j>=size+1)
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			for(int k=1;k<=size; k++)
			{
				if(k<i)
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
