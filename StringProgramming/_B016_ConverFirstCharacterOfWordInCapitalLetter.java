package StringProgramming;

public class _B016_ConverFirstCharacterOfWordInCapitalLetter 
{
	public static void main(String[] args) 
	{
		String st="in The box";
		String[] s = st.split(" ");
		
		for(int i=0; i<s.length;i++)
		{
			if(s[i].charAt(0)>='a' && s[i].charAt(0)<='z')
			{
		  s[i]=(char) (s[i].charAt(0)-32)+s[i].substring(1,s[i].length());
		   
			}
			System.out.println(s[i]);
			   
		}
		
	}

}
