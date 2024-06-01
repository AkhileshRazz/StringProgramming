package CollectionBased;

import java.util.Set;
import java.util.TreeSet;

public class _A003_SortingOfIntegerArrayByUsingTreeSet 
{
	public static void main(String[] args) 
	{
		int[] a= {3,5,2,6,1,4};
		Set set = new TreeSet();
		
		for(int e: a)
		{
		    set.add(e);	
		}
		System.out.println(set);
		
	}

}
