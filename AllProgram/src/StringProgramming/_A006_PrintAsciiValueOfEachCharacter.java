package StringProgramming;

public class _A006_PrintAsciiValueOfEachCharacter 
{
	public static void main(String[] args) 
	{
		String st ="Bengaluru123";
		
		for(int i=0; i<st.length(); i++)
		{
			int ascii =st.charAt(i);
			char ch = st.charAt(i);
			System.out.println("Ascii value of "+ch+" is "+ascii);
		}
		
	}

}
