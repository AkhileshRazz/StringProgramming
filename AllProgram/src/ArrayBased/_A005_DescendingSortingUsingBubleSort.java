package ArrayBased;

public class _A005_DescendingSortingUsingBubleSort 
{
	public static void main(String[] args) 
	{
		int[] a= {10,20,5,6,50,30,1};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		
		
		

}
}
