package StarPattern;

public class pratice123 
{

	public static void main(String[] args) 
	{
	
		int size=3;
		for(int i=1;i<=size;i++)
		{
			int k=1;
			for(int j=1; j<=size;j++)
			{
				if(i+j>=size+1)
				{
					System.out.print(k+" ");
					if(k<size)
					{
						k++;
					}else {
						k--;
					}
				
				}else {
					System.out.print("  ");
				}
			}
			for(int p=1;p<=size; p++)
			{
				
				if(p<i)
				{
					System.out.print(k+" ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}
	

}
