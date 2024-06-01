package StringProgramming;

public class _A005_PrintVowelOnly 
{
	public static void main(String[] args) 
	{
		String st="Bengaluru";
		String s = st.toLowerCase();
		int count=0;
		
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.println(ch);
				count++;
			}
				
		}
		System.out.println("total vowel is :"+ count);
		
	}

}
