package StringProgramming;

import java.util.ArrayList;

public class _Interview001_BalancedString 
{ 
	public static void main(String[] args) 
	{
		String st = "({[()]})";
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i=0; i<st.length(); i++)
		{
			char ch = st.charAt(i);
			
			if( (list.size() !=0)&& ( 
					(ch==')' && list.get(list.size()-1)=='(')       || 
					(ch==']' && list.get(list.size()-1)=='[')       ||
					(ch=='}' && list.get(list.size()-1)=='{')
					)
					)
			{
				list.remove(list.size()-1);
			}else {
				list.add(ch);
			}
			
		}
		
		if(list.size()==0)
		{
			System.out.println("String is Balanced");
		}else {
			System.out.println("String is not Balance");
		}
		
	
    }

}
