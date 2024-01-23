
public class BinarySearch {
	
	// 2 3 7 8 9 10 12
	// target is 8
	public static void main(String args[])
	{
		//int [] ar= {1,2,4,5,6,8,10,12,15};
		int[] ar= {33,30,24,22,18,15,12,8,7,5};
		int target=5;
		
		int p=binarySearchX(ar,target);
		
		System.out.println(p);
	}
	
	
	static int binarySearchX(int[] ar,int target)
	{
		
		int start=0;
		int end=ar.length-1;
		
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(ar[mid]>target)
			{
				start=mid+1;
				
			}
			else if(ar[mid]<target)
			{
				end=mid-1;
				
				
			}
			
			else
			{
				System.out.print("got it");
				return mid;
				
			}
			
		
		}
		return -1;
	}

}
