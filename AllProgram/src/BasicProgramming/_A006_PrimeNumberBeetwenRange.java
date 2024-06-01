package BasicProgramming;

public class _A006_PrimeNumberBeetwenRange
{
	public static void main(String[] args) 
	{
		int total=0;
		for(int i=1; i<15;i++)
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
				System.out.print(i+" ");
				total++;
			}
		}
		System.out.println();
		System.out.println("total prime is :"+total);
	}

}
