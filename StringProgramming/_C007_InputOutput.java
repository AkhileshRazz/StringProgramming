package StringProgramming;

public class _C007_InputOutput 
{
	public static void main(String[] args) {
		String st = "a2b2cd2";// output=aa,bb,c,dd
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch >= '0' && ch <= '9') {
				int n = ch - 48;
				for (int j = 1; j < n; j++) {
					System.out.print(st.charAt(i-1));
				}
			}else if(ch >= 'a' && ch <= 'z'){
				System.out.print(st.charAt(i));
			}
		}

}
}
