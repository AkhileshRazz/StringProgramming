package ArrayBased;

public class _A011_PrintAllTwoDigitNumber {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 60, 12 };
		for (int i = 0; i < a.length; i++) {
			 int ch = a[i];

			if (ch >= 10 && ch <= 99)//this is number not character 
			{
				System.out.println(a[i]);
			}
		}

	}
}
