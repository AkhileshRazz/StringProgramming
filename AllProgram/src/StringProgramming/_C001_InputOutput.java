package StringProgramming;

public class _C001_InputOutput 
{
	public static void main(String[] args) 
	{
	String st="Hi Hello Welcome to";//output=to Hello Welcome Hi
	String[] s = st.split(" ");
	
	String temp=s[0];
	s[0]=s[s.length-1];
	s[s.length-1]=temp;
	for(String e: s)
	{
		System.out.print(e+" ");
	}
	}
	

}
