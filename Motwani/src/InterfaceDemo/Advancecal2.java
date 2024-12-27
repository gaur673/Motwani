package InterfaceDemo;

public class Advancecal2 implements Calcu
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	 	base class reference and child class object
		
		Calcu ob1= new Advancecal2();
		ob1.add();
		ob1.sub();
		
		

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
