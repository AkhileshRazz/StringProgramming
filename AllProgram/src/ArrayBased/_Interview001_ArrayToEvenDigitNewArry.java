package ArrayBased;

public class _Interview001_ArrayToEvenDigitNewArry 
{
	public static void main(String[] args) 
	{
		int[] a= {10,5,6,45,40,56,23};
		int count=0;
		int index=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
		}
		int[] a2= new int[count];
		
		for(int j=0; j<a.length; j++)
		{
			if(a[j]%2==0)
			{
				a2[index]=a[j];
				index++;
			}
		}
		for(int e: a2)
		{
			System.out.print(e+" ");
		}
	}

}
