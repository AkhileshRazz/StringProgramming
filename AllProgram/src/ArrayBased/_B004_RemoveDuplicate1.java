package ArrayBased;

public class _B004_RemoveDuplicate1 
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,10,10,12};
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					if(i>j)
					{
						break;
					}else {
						count++;
					}
				}
			}
			if(count>=1)
			{
				System.out.println(a[i]);
			}
		}
		
	}


}
