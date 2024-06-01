package StringProgramming;

public class _B018_SeperateEachWordWithoutSplitMethod 
{
	public static void main(String[] args) 
	{
		String st="In The Box";
		String result="";
		
		for(int i=0;i<st.length();i++)
		{
			if(!(Character.isWhitespace(st.charAt(i))))
			{
				System.out.print( st.charAt(i));
			}else {
				
				System.out.println();
			}
		}
		
	}

}
