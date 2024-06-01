package StringProgramming;

public class _C004_InputOutput
{
	public static void main(String[] args) 
	{
		String st="aabbaddd";/*output a2
		                              b2
		                              a1
		                              d1 */
		int count=1;
		for(int i=0; i<st.length()-1; i++)
		{
			if(st.charAt(i)==st.charAt(i+1))
			{
				count++;
			}else {
				System.out.println(st.charAt(i)+""+count);
				count=1;
			}
			
		}
		System.out.println(st.charAt(st.length()-1)+""+count);
		
		
	}


}
