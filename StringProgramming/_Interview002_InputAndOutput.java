package StringProgramming;

public class _Interview002_InputAndOutput 
{
	public static void main(String[] args) 
	{
		String st ="aabccdee";//output=a2b1c2e2
		int count=1;
		for(int i=0; i<st.length()-1; i++)
		{
			if(st.charAt(i)==st.charAt(i+1))
			{
				count++;
			}else {
				System.out.print(st.charAt(i)+""+count);
				count=1;
			}
		}
		System.out.print(st.charAt(st.length()-1)+""+count);
		
	}

}
