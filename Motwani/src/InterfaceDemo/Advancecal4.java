package InterfaceDemo;

public class Advancecal4 implements Calcu
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// user cannot change variable from interface. They are by default defined as final  
		//int x=90;
		
		
	

	}
	
	public void calculateSin()
	{
		System.out.println("i m in SinQ method");
	}
	
	public void calculateCos()
	{
		System.out.println("i m in Cos Q method");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("i m in add method");
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("i m in sub method");
		
	}

}
