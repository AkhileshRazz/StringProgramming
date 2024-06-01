package StringProgramming;

public class _B020_SwapFirstAndLastCharacterOfEachWordOfString 
{
	public static void main(String[] args) 
	{
		String st="In The Box";
		String[] s = st.split(" ");
		for(int i=0;i<s.length;i++)
		{
			String word = s[i];
			char firstchar=word.charAt(0);
			char lastchar=word.charAt(word.length()-1);
			word=lastchar+word.substring(1,word.length()-1)+firstchar;
			System.out.print(word+" ");
		}
		
//		String a="hi";
//		String b="hi";
//		if(a==b) {
//			System.out.println("pass");
//			
//		}else {System.out.println("fail");}
	}

}
