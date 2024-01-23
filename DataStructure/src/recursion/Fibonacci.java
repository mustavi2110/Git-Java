package recursion;

public class Fibonacci {
	public static void main(String [] args)
	{
		System.out.println(fibonacci(5));
		
		int [] ar= {1,2,3,4,5,6,7};
		int x=binarysearch(ar,0,ar.length-1,5);
		System.out.print(x);
	}
	
	
	static int fibonacci(int n)
	{
		if(n<2)
		{
			return n;
		}
		
		return fibonacci(n-1)+ fibonacci(n-2);
	}
	
	static int binarysearch(int [] ar,int st,int end,int target)
	{
		int mid=(st+end)/2;
		if(target==ar[mid])
		{
			return  mid;
		}
		
		if(target<ar[mid])
		{
			return binarysearch( ar,st,mid-1, target);
		}
		
		return binarysearch( ar,mid+1,end, target);
	}

}
