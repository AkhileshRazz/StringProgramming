package BasicProgramming;

import java.util.Iterator;

public class _A001_AllFactorOfANumber 
{
	public static void main(String[] args) 
	{
		int n=32;
		int count=0;
		for(int i=1; i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total factor of "+n+" is :"+count);
		
	}

}
