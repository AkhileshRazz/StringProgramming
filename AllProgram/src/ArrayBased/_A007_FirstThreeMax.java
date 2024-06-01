package ArrayBased;

public class _A007_FirstThreeMax 
{
	public static void main(String[] args) 
	{
		int[] a = {10,20,5,6,50,40,20,6,7};
		int max1=a[0];
		int max2=a[0];
		int max3=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max1<a[i])
			{
				//min3=min2;
				max2=max1;
				max1=a[i];
			}else if(max2<a[i]) 
			{
				max3=max2;
			  max2=a[i];	
			}else if(max3<a[i]) {
				
				max3=a[i];
			}
		}
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(max3);
		
		
		
		
	}

}
