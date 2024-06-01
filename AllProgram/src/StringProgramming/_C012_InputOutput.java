package StringProgramming;

public class _C012_InputOutput{
	public static void main(String[] args) {
		String st = "hi hello welcome abcde";
		String[] s = st.split(" ");
		String max = "";
		String max2 = "";
		String max3 = "";

		for (int i = 0; i < s.length; i++) {
			if (s[i].length() > max.length()) {
				max2 = max;
				max = s[i];
			} else if (s[i].length() > max2.length()) {
				max3 = max2;
				max2 = s[i];
			} else if (s[i].length() > max3.length()) {
				max3 = s[i];
			}
		}
		//System.out.println(max);
		System.out.println(max2);
		System.out.println(max3.substring(0,max3.length()-1));

	}

}
