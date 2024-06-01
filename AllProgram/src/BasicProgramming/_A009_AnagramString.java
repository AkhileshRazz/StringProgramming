package BasicProgramming;

import java.util.Arrays;

public class _A009_AnagramString 
{
	public static void main(String[] args) 
	{
		String a="top";
		String b="pot";
		if(a.length()==b.length())
		{
			char[] ch1 = a.toCharArray();
			char[] ch2 = b.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean flag=false;
			
			for(int i=0 ;i<ch1.length;i++)
			{
				if(ch1[i]==ch2[i])
				{
					flag=true;
				}else {
					break;
				}
			}
			if(flag==true) {
				System.out.println("Angram");
			}else {
				System.out.println("not angram");
			}
		}
		
	}

}
