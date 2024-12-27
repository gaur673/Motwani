package InterfaceDemo;

public class Advancecal implements Calcu
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	 	Child class reference and Child class object
		
		Advancecal ob1= new Advancecal();
		ob1.add();
		ob1.sub();
		ob1.calculateCos();
		ob1.calculateCos();

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
		
		System.out.println("i m in add method");
		
	}
	
	

	@Override
	public void sub() {
		
		System.out.println("i m in sub method");
		
	}

}
