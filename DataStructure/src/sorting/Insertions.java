package sorting;

import java.util.Arrays;

public class Insertions {
	
	public static void main(String [] args)
	{
      int []ar= {4,3,6,9,10};
		
		insertionSort(ar);
		System.out.print(Arrays.toString(ar));
		
		
	}

	
	static void insertionSort(int [] ar)
	{
		for(int i =0;i<ar.length-1;i++)
		{ 
			for ( int j=i+1;j>0;j--)
			{
				if(ar[j]<ar[j-1])
				{
					int temp=ar[j-1];
					ar[j-1]=ar[j];
					ar[j]=temp;
				}else
				{
					break;
				}
			}
		}
	}
}
