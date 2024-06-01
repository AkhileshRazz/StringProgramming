package StringProgramming;

public class _C013_InputOutput
{
	public static void main(String[] args) 
	{
		String st ="my name is prakas";
		String[] s = st.split(" ");
		
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = 0; j < s.length; j++) 
			{
				if(i==0 && j==s.length-1)
				{
					String temp=s[i];
					s[i]=s[s.length-1];
					s[s.length-1]=temp;
				}
				
			}			
			
		}
		for(String e:s)
		{
			System.out.print(e+" ");
		}
		
	}

}
