package StringProgramming;

public class _B023_RemoveDuplicateWord 
{
	public static void main(String[] args) 
    {
		String st="Hi Hello Hello Welcome to to";
		String[] s=st.split(" ");
		
		for (int i = 0; i < s.length; i++) 
		{
			int count=0;
			for (int j = 0; j < s.length; j++) 
			{
				if(s[i].equalsIgnoreCase(s[j]))
				{
					if(i>j)
					{
						break;
					}else {
						count++;
					}
					
				}
				
			}
			if(count>=1)
			{
				System.out.println(s[i]);
			}
		}
   }

}
