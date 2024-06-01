package ArrayBased;

public class _A006_SelectFirstMinimumAndFirstMax {
	public static void main(String[] args) {
		int[] a = { 10, 30, 5, 6, 50, 20, 1 };
		
		int max = a[0];
		int min =a[0];
		
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] > max) {
				max = a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
	}
}
