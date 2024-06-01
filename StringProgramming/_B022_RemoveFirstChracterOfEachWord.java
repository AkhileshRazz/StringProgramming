package StringProgramming;

public class _B022_RemoveFirstChracterOfEachWord 
{
	public static void main(String[] args) 
	{
		String st ="In The Box";
		String[] s = st.split(" ");
		
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i].substring(1));
		}
		
	}

}
