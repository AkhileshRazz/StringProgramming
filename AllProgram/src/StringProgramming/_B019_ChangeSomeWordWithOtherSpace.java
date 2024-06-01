package StringProgramming;

public class _B019_ChangeSomeWordWithOtherSpace 
{
	public static void main(String[] args) 
	{
		String st= "In The Box"; //chnage Box By Blue
		String[] s = st.split(" ");
		for(int i=0; i<s.length; i++)
		{
			if(s[i].equals("Box"))
			{
				s[i]="Blue";
			}
			System.out.println(s[i]);
		}
		
	}

}
