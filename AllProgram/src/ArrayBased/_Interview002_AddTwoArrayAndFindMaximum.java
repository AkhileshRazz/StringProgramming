package ArrayBased;

public class _Interview002_AddTwoArrayAndFindMaximum
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,5};
		int[] a2= {7,8,18,12};
		int sum =a.length+a2.length;
		int[] array=new int[sum];
		
		for(int i=0;i<array.length;i++)
		{
			if(i<a.length)
			{
			array[i]=a[i];
			}else {
				
				array[i]=a2[i-a.length];
			}
			
		}
		for(int k=0;k<array.length;k++)
		{
			for(int p=k+1; p<array.length;p++)
			{
				if(array[k]>array[p])
				{
					int temp=array[k];
					array[k]=array[p];
					array[p]=temp;
				}
			}
		}
		System.out.println(array[array.length-1]);
	}

}
