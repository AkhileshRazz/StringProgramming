package StringProgramming;

public class _B017_PrintFirstChracterOfWord 
{
	public static void main(String[] args) 
	{
		String st ="In The Box";
		String[] s = st.split(" ");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].charAt(0));
		}
		
	}

}
