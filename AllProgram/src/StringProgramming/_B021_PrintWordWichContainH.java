package StringProgramming;

public class _B021_PrintWordWichContainH 
{
	public static void main(String[] args) 
	{
		String st="In The Box Of House house";
		String st1 = st.toLowerCase();	
		String[] s = st1.split(" ");
		String[] s1 = st.split(" ");
		
		for(int i=0;i<s.length; i++)
		{
			String word = s[i];
			if(word.contains("h"))
			{
				System.out.println(s1[i]);
			}
		}
		
	}

}
