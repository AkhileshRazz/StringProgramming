package StringProgramming;

public class _A008_CheckGivenStringIsPalindrom 
{
	public static void main(String[] args)
	{
		String st="Malayalam";
		String rev="";
		for(int i=st.length()-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
		}
		if(rev.equalsIgnoreCase(st))
		{
			System.out.println("String is palindrom");
		}else {
			System.out.println("String is not palindrom");
		}
		
		
	}

}
