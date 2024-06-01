package StringProgramming;

public class _Interview004_InputAndOutput 
{
	public static void main(String[] args) 
	{
		String st="I am from Punjab";//output= I am morf punjab
		String[] s = st.split(" ");
		
		for(int i=0;i<s.length;i++)
		{
			String word = s[i];
			if(s[i].equals("from"))
			{
				String rev="";
				for(int j=word.length()-1;j>=0;j--)
				{
					rev=rev+word.charAt(j);
				}
				s[i]=rev;
			}
			System.out.print(s[i]+" ");
		}
		
	}

}
