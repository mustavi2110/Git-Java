package recursion;

public class NumtoDigit {
	
	public static void main(String [] args)
	{
		System.out.print(digitSum(5432691));
		
	}
	
	static int digitSum(int n)
	{
		if(n<10)
		{
			return n;
		}
		
		return (n%10)+ digitSum(n/10);
	}

}
