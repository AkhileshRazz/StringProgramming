package StringProgramming;

public class _B022_CreateStringFromStringStartingWithDigitThanCharacter 
{
	public static void main(String[] args)
	{
		String st ="No 26 Sound";		
		String digit="";
		String ch="";
		
		for(int i=0; i<st.length(); i++)
		{
			if(st.charAt(i)>='0' && st.charAt(i)<='9')
			{
				digit=digit+st.charAt(i);
			}else {
				ch=ch+st.charAt(i);
			}
		}
		System.out.println(digit+" "+ch);
	}

}
