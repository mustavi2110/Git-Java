package sorting;

public class Calculate {
	
	public static void main(String args[])
	{
		System.out.print(calculateEMI(1,100000,(float) 0.06));
	}
	
	
	static double calculateEMI(int years,long amount,float interest)
	{
		
		int month=12*years;
		double result= ((amount * interest) *( Math.pow((1+interest), month)))/
				(Math.pow((1+interest), month-1));
		return result;
	}

}
