package BasicProgramming;

public class _A007_Nth_PrimeNumberBeetwenRange 
{
	public static void main(String[] args) 
	{
		int total=0;
		
		for(int i=1; i<100;i++)
		{
			
			int count=0;
			for(int j=1;j<=i;j++)
			{
				
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				
				total++;
				if(total==6)
				{
					System.out.println(i);
				}
			}
			
		}
		
	}

}
