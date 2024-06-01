package StringProgramming;

public class _C002_InputOutput 
{
	public static void main(String[] args) 
	{
		String st="I am selenium";//output=m ui nelesmaI
		String s = st.replace(" ", "");
		
		int j = s.length()-1;
		
		for(int i=0;i<st.length();i++)
		{
		 if(st.charAt(i)!=' ')
		 {
			 System.out.print(s.charAt(j));
			j--;
		 }else {
			 System.out.print(st.charAt(i));
		 }
		}
		
	}

}
