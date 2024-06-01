package StringProgramming;

public class _A002_PrintOnlyUpperChracterCharacter 
{
	public static void main(String[] args) 
	{
		String st ="Bengaluru";
		for(int i=0; i<st.length();i++)
		{
			if(st.charAt(i)>='A' && st.charAt(i)<='Z')
			{
				System.out.println(st.charAt(i));
			}
		}
		
		
	}

}
