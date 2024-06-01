package StringProgramming;

public class _A009_OccuranceOfEachChracterOfString 
{
	public static void main(String[] args) 
	{
		String st="Bengaluru";
		String s = st.toLowerCase();
		
		for(int i=0;i<s.length();i++) {
			int count =0;
			for(int j=0;j<s.length();j++) {
				if(st.charAt(i)==s.charAt(j)) {
					if(i>j)
						{break;
						}else {
						
					 count++;
						}
					
				}
				
			}
			if(count>=1)
				System.out.println(st.charAt(i)+"---"+count);
		}
		
		
				

}
}
