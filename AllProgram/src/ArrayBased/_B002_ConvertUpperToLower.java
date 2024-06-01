package ArrayBased;

public class _B002_ConvertUpperToLower 
{
	public static void main(String[] args) 
	{
		String[] a= {"No", "Sound","26"};
		
		for(int i=0;i<a.length;i++)
		{
			String result="";
			String word = a[i];
			for(int j=0;j<word.length();j++)
			{
				if(Character.isUpperCase(word.charAt(j)))
				{
					result=result+""+(char)(word.charAt(j)+32);
				}else if(Character.isLowerCase(word.charAt(j)))
				{
					result=result+""+(char)(word.charAt(j)-32);
				}
			}
			System.out.println(result);
			
		}
		
		
	}

}
