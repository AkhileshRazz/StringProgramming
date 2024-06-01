package StringProgramming;

public class _A008_CheckGivenNumberIsPalindrom 
{
	
	public static void main(String[] args)
	{
		int a1=12121;
		int a2=a1;
		int rev=0;
		
		while(a2!=0)
		{
			
			rev= rev*10+a2%10;
			
			a2=a2/10;
		}
		System.out.println(rev);
		
		
		
	}
}
