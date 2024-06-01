package StringProgramming;

public class _A003_ConverUpperToLowerAndLowerToUpper 
{
	public static void main(String[] args) 
	{
		String st ="Bengaluru";
		String s="";
		
		for(int i=0; i<st.length(); i++)
		{
			if(st.charAt(i)>='A' && st.charAt(i)<='Z')
			{
				s=s+(char)(st.charAt(i)+32);
			}else {
				s=s+(char)(st.charAt(i)-32);
			}
		}
		System.out.println(s);
	}

}
