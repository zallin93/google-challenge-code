package code;

public class PiCalculate {

	public static double calculatePi()
	{
		double[] denom = {2, 3, 4};
		double val = 3;
		
		for(double i = 0; i < 1000000000; i++)
		{
			val += 4.0/(denom[0]*denom[1]*denom[2]);
			denom[0]++;
			denom[1]++;
			denom[2]++;
			
			val -= 4.0/(denom[0]*denom[1]*denom[2]);
			denom[0]++;
			denom[1]++;
			denom[2]++;
		}
		
		return val;
	}
	
	public static double calculate2()
	{
		double val = 4;
		for(double i = 3; i < 1000000000; i+=2)
		{
			val -= 4/i;
			i+=2;
			val += 4/i;
		}
		
		return val;
	}
	
	public static void main(String[] args)
	{
		//System.out.println(PiCalculate.calculatePi());
		System.out.println(PiCalculate.calculate2());
	}
}
