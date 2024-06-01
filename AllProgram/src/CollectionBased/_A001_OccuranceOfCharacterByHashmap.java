package CollectionBased;

import java.util.HashMap;
import java.util.Map;

public class _A001_OccuranceOfCharacterByHashmap
{
	public static void main(String[] args) 
    {
		String st="welcome";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i=0; i<st.length(); i++)
		{
			if(hm.containsKey(st.charAt(i)))
			{
				hm.put(st.charAt(i), hm.get(st.charAt(i))+1);
			}else
			{
				hm.put(st.charAt(i), 1);
			}
		}
		System.out.println(hm);
		
   }

}
