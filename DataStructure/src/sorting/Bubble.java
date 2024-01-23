package sorting;

import java.util.Arrays;

public class Bubble {
	
	public static void main(String args[])
	{
		int []ar= {4,3,6,9,10};
		
		bubbleSort(ar);
		
		
	}
	
	static void bubbleSort(int []ar)
	{
		for(int i =0;i<ar.length;i++)
		{
			for(int j=1;j<ar.length-i;j++)
			{
				if(ar[j-1]<ar[j])
				{
					int temp=ar[j];
					ar[j]=ar[j-1];
					ar[j-1]=temp;
				}
			}
		}
		System.out.print(Arrays.toString(ar));
	}
	
	

}
