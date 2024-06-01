package StarPattern;

public class _A00_Trangle
{
public static void main(String[] args) 
{
	int size=4;
	for(int i=1;i<=size;i++)
	{
		char k='A';
		for(int j=1; j<=2*size-1;j++)
		{
			if(i+j>=size+1 && j-i<=size-1)
			{
				System.out.print(k+" ");
				if(j<size)
				{
					k++;
				}else{
					k--;
				}				
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
	
    }

}
}
