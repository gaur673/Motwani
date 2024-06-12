package Parameter;

public class PassParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PassParameter pp= new PassParameter();
		pp.add(2, 4);
		pp.sub(3, 10);

	}
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
				
	}
	
	
	public void sub(double x, double y)
	{
		double r=y-x;
		System.out.println(r);
	}

	
}
