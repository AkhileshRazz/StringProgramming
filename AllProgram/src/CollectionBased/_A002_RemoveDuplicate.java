package CollectionBased;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class _A002_RemoveDuplicate 
{
	public static void main(String[] args) 
	{
		String res="";
		String st ="Bengaluru";
		String s = st.toLowerCase();
		Set set= new LinkedHashSet();
		char[] array = s.toCharArray();
		for(char e: array)
		{
			set.add(e);
		}
		for(Object e:set)
		{
			res=res+e;
		}
		
		System.out.println(res);
	}

}
