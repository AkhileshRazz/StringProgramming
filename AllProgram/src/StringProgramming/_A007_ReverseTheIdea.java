package StringProgramming;

public class _A007_ReverseTheIdea 
{
	public static void main(String[] args) 
	{
		String st="Bengaluru";
		String rev="";
		for(int i=st.length()-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
		}
		System.out.println(rev);
	}

}
