package StringProgramming;

public class _B023_ReverseEachWordOfGivenString
{
	public static void main(String[] args) 
	{
		String st ="In The Box";
		String[] s = st.split(" ");
		for(int i=0; i<s.length; i++)
		{
			String rev="";
			for(int j= s[i].length()-1;j>=0; j--)
			{
				rev=rev+s[i].charAt(j);
			}
			System.out.print(rev+" ");
		}
		
	}

}
