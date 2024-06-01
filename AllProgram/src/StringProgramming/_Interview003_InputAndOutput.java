package StringProgramming;

public class _Interview003_InputAndOutput 
{
	public static void main(String[] args) 
	{
		String st ="aabccdee";/*output=aa
		                               b
		                               cc
		                               d
		                               ee       */
		
		
		for(int i=0; i<st.length()-1; i++)
		{
			if(st.charAt(i)==st.charAt(i+1))
			{
				System.out.print(st.charAt(i));
				
			}else {
				
				System.out.println(st.charAt(i));
			}
		}
		System.out.println(st.charAt(st.length()-1));
		
	}


}
