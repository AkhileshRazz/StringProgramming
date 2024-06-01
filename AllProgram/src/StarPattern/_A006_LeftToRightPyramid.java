package StarPattern;

public class _A006_LeftToRightPyramid
{

	public static void main(String[] args) 
	{
		int size=5;
		for(int i=1; i<=size;i++)
		{
			
		for(int j=1; j<=size;j++)
		{
			if(j<=i)
			{
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
			
		}
		System.out.println();
		}
		
//--------------Second trangle---------------------------------------- noway to reduce forloop------
//------in horizantal adding of trangle it is possible but vertical adding not possible--------------
		
		for(int i=1;i<=size;i++)
		{
		
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
