package StarPattern;

public class _Interview001_OneGapTrangle {
	public static void main(String[] args) {
		int size = 6;
		int n = size + 1;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size * 2 - 1; j++) {
				if (i + j >= size + 1 && j - i <= size - 1 && i+j==n) {
					System.out.print("* ");
					n=n+2;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
			n=size+1;
		}
	}
}
