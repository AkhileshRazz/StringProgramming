package ArrayBased;

public class _A007_SumOfFirstThreeMiniAndSumOfFirstThreeMin 
{
	public static void main(String[] args) 
	{
		int[] a = {10,20,5,6,50,40,20,6,7};
		int min1=a[0];
		int min2=a[0];
		int min3=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min1>a[i])
			{
				//min3=min2;
				min2=min1;
				min1=a[i];
			}else if(min2>a[i]) 
			{
				min3=min2;
			  min2=a[i];	
			}else if(min3>a[i]) {
				
				min3=a[i];
			}
		}
		System.out.println(min1);
		System.out.println(min2);
		System.out.println(min3);
		
		
		
		
	}

}
