package StringProgramming;

public class _C003_InputOutput
{
	public static void main(String[] args) 
	{
		String st="aabbaddc";/*output aa 
		                              bb
		                              a
		                              dd
		                              c  */
		
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
