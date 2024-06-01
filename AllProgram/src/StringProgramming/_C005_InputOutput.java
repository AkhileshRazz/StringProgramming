package StringProgramming;

public class _C005_InputOutput {
	public static void main(String[] args) {
		String st = "a2b2d3";// output=aa,bb,c,d
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch >= '0' && ch <= '9') {
				int n = ch - 48;
				for (int j = 0; j < n; j++) {
					System.out.print(st.charAt(i-1));
				}
			}
		}

	}

}
