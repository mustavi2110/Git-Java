import java.util.Arrays;

public class BinarySearch2D {
	
	public static void main(String[] args)
	{
		   int[][] ar= {
	                {10, 20, 30},
	                {15, 25, 35},
	                {28, 29, 37}
	        };

	        System.out.println(Arrays.toString(binarySearchD(ar,25)));
	}
	
	
	static int[] binarySearchD(int [][] arr,int target)
	{
		int row=0;
		int col=arr.length-1;
		
		
		while(col>=0 && row<arr.length)
		{
			if(target==arr[row][col])
			{
				return new int[]{row,col};
			}
			
			if (target>arr[row][col])
			{
				row++;
			}else
			{
				col--;
			}
		}
		return new int[] {-1,-1};
	}

}
