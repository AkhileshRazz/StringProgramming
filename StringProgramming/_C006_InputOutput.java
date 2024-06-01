package StringProgramming;


public class _C006_InputOutput 
{
	public static void main(String[] args) 
	{
		String st="Hello";//H-e--l---l----o
		int  count=0;
		for(int i=0;i<st.length()-1; i++)
		{
			count++;
			System.out.print(st.charAt(i));
			
			int number=count;
			while(number!=0 )
			{
				System.out.print("-");
				number--;
			}
		}
		System.out.println(st.charAt(st.length()-1));
		
	}

}
