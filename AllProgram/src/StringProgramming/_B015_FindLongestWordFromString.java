package StringProgramming;

public class _B015_FindLongestWordFromString 
{
	public static void main(String[] args)
	{
		String st ="In The Box";
		String[] s = st.split(" ");
		int length=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()>length)
			{
				length=s[i].length();
			}
			
		}
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()>=length)
			{
				System.out.println(s[i]);
			}
			
		}
		
	}

}
