package ArrayBased;

public class _B001_printEachChracterAndItsAsciiValue
{
	public static void main(String[] args) 
	{
		String[] a= {"No","26","Sound"};
		for(int i=0;i<a.length;i++)
		{
			String word = a[i];
			for(int j=0;j<word.length();j++)
			{
				System.out.println("Character is "+word.charAt(j)+" Ascii value is "+(int)word.charAt(j));
			}
		}
		
	}

}
