package Parameter;

public class DynamicCalculator {

	
	public int add(int a, int b)
	{
		int c=a+b;
		return c;
				
	}
	
	
	public double sub(double x, double y)
	{
		double r=y-x;
		return r;
	}
	
	public static String getMyfullName(String fname,String lname)
	{
		String fullName= fname + lname;
		return fullName;
	}

}
