package StringProgramming;

public class _A014_AddAllIntegerPresentInSideString 
{
	public static void main(String[] args)
	{
		String st="123";
		int result=0;
		for(int i=0;i<st.length();i++)
		{
			result= result+st.charAt(i)-48;
		}
		System.out.println(result);
		
	}

}
