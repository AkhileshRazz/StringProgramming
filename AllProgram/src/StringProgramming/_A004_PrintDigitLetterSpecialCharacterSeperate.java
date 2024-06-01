package StringProgramming;

public class _A004_PrintDigitLetterSpecialCharacterSeperate 
{
	public static void main(String[] args) 
	{
		String st="Bengaluru12$#3BT2M";
		String letter="";
		String digit="";
		String spc="";
		String result="";
		
		for(int i=0; i<st.length(); i++)
		{
			if(st.charAt(i)>='A' && st.charAt(i)<='Z' || (st.charAt(i)>='a' && st.charAt(i)<='z'))
			{
				letter=letter+st.charAt(i);
			}else if(st.charAt(i)>='0' && st.charAt(i)<='9')
			{
				digit=digit+st.charAt(i);
			}else {
				spc=spc+st.charAt(i);
			}
		}
		result=letter+digit+spc;
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(spc);
		System.out.println(result);
		
	}

}
