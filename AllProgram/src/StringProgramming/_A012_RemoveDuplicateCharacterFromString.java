package StringProgramming;

public class _A012_RemoveDuplicateCharacterFromString 
{
	public static void main(String[] args) 
	{
		String st="Bengaluru";
		String s = st.toLowerCase();
		String str="";
		
		for(int i=0; i<s.length(); i++)
		{
			int count=0;
			for(int j=0; j<s.length(); j++) 
			{
			if(s.charAt(i)==s.charAt(j))
			{
				if(i>j)
				{
					break;
				}else {
					count++;
				}
			}
				
		}
			if(count>1) 
			{
				str=str+st.charAt(i);
				
			}	
		
	}
		System.out.print(str);

}
}
