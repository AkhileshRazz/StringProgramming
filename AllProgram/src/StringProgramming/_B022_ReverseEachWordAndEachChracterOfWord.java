package StringProgramming;

public class _B022_ReverseEachWordAndEachChracterOfWord 
{
	public static void main(String[] args) 
	{
		String st="In The Box";
		String[] s = st.split(" ");
		for(int i=s.length-1;i>=0; i--)
		{
			String rev="";
			String word = s[i];
			for(int j=word.length()-1;j>=0;j--)
			{
				rev=rev+word.charAt(j);
			}
			System.out.println(rev+" ");
		}
		
	}

}
