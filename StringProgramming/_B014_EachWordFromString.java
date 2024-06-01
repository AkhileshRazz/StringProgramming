package StringProgramming;

public class _B014_EachWordFromString 
{
	public static void main(String[] args)
	{
		String st="In The Box";
		String[] s = st.split(" ");
		for(String e:s)
		{
			System.out.println(e);
		}
		
	}

}
