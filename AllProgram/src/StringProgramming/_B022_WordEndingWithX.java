package StringProgramming;

public class _B022_WordEndingWithX 
{
	public static void main(String[] args) 
	{
		String st ="In The Box XoX";
		String[] s = st.split(" ");
		
		for(int i=0; i<s.length; i++)
		{
			char ch = s[i].charAt(s[i].length()-1);
			if(ch=='x' || ch=='X')
			{
				System.out.println(s[i]);
			}
		}
		
		
	}

}
