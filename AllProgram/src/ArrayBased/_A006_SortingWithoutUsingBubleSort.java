package ArrayBased;

public class _A006_SortingWithoutUsingBubleSort 
{
	public static void main(String[] args) 
	{
		int[] a= {10,20,5,6,50,1};
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i]>a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
			}
			
		}
	
		for(int e:a)
		{
			System.out.print(e+" ");
		}
	}

}
