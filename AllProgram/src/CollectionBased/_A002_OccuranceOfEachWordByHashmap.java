package CollectionBased;

import java.util.HashMap;
import java.util.Map.Entry;

public class _A002_OccuranceOfEachWordByHashmap
{
	public static void main(String[] args) 
	{
		String st ="my name my name is is raj";
		String[] s = st.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(int i=0; i<s.length; i++)
		{
			if(hm.containsKey(s[i]))
			{
				hm.put(s[i], hm.get(s[i])+1);
			}else
			{
				hm.put(s[i], 1);
			}
		}
		for(Entry<String, Integer> ent : hm.entrySet())
		{
			if(ent.getValue()>1)
			{
				System.out.println();
			}
			
		}
		
		
   }
		
		
	}

