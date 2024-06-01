package BasicProgramming;

public class _A008_CAR_To_SBD 
{
	public static void main(String[] args) 
	{
		String st="CAR";
		String res="";
		for (int i = st.length()-1; i >=0; i--)
		{
			char ch = st.charAt(i);
			res=res+(++ch);
			
		}
		System.out.println(res);
		
	}

}
