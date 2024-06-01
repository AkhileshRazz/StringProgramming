package BasicProgramming;

public class _A004_SumOfDigitOfNumber
{
	public static void main(String[] args) 
	{
		int number=2345;
		int n=number;
		int sum=0;
		while(n!=0)
		{
			int k=n%10;
			sum=sum+k;
			n=n/10;
		}
		System.out.println(sum);
		
	}

}
