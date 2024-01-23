import java.util.Arrays;

public class BinarySearchAdvance {
	
	
	public static void main(String args[])
	{
		   int[][] ar= {
	                {1,2,3,4},
	                {5,6,7,8},
	                {9,10,11,12},
	                {13,14,15,16}
	        };

	        System.out.println(Arrays.toString(searchD(ar,10)));
	
	}
	
	
	
	static int[] binarySearch(int cSt,int cEnd,int r,int [] []ar,int target)
	{
		
		
		while(cSt<=cEnd)
		{
			int mid=(cSt+cEnd)/2;
			
			if(ar[r][mid]==target)
			{
				return new int[] {r,mid};
			}
			
			if(ar[r][mid]<target)
			{
				cSt=mid+1;
			}else
			{
				cEnd=mid-1;
			}
		}
		
		return new int[] {-1,-1};
	}
	
	
	
	static int[] searchD(int [][] ar,int target)
	{
		int row=ar.length;
		int col=ar[0].length;
		
		if(row==1)
		{
			return binarySearch(0,col-1,0,ar, target);
		}
		
		int rstart=0;
		int rend= row-1;
		int cmid=col/2;
		while(rstart< rend-1)
		{
			int mid=(rstart+rend)/2;
			if(target==ar[mid][cmid])
			{
				return new int[] {mid,cmid};
				 
			}
			if(target>ar[mid][cmid])
			{
				rstart=mid;
				 
			}else
			{
				rend=mid;
			}
			
			
		}
		
		// two rows remaining
		
		//CHecking two rows middle
		
		if(ar[rstart][cmid]==target)
		{
			return new int[] {rstart,cmid};
		}
		
		if(ar[rstart+1][cmid]==target)
		{
			return new int[] {rstart+1,cmid};
		}
		
		//search in all  around the mid 
		if(ar[rstart][cmid-1]>=target)
		{
			
			return binarySearch(0,cmid-1,rstart,ar,target);
		}
		
		if(ar[rstart][cmid+1]<=target && target<=ar[rstart][col-1])
		{
			return binarySearch(cmid+1,col-1,rstart,ar,target);
		}
		if(ar[rstart+1][cmid-1]>=target)
		{
			return binarySearch(0,cmid-1,rstart+1,ar,target);
		}else
		{
			return binarySearch(cmid+1,col-1,rstart+1,ar,target);
		}
		
		
		
	}
}
