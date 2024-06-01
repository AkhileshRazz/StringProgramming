package BasicProgramming;

public class _A004_SumOfFirstAndLastDigitOfNumber 
{
	public static void main(String[] args) 
	{
		int number=848203;
		int n=number;
		int lastdigit=n%10;
		int firstdigit=0;
		while(n!=0)
		{
			firstdigit=n%10;
			n=n/10;
		}
		System.out.println(firstdigit+lastdigit);
		
		
		
	}

}
