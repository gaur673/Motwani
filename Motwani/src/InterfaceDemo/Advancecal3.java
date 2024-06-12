package InterfaceDemo;

public class Advancecal3 implements Calcu
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// 	base class reference and base class object(invalid scenario)
		// cannot create object of Interface
	//	Calcu ob1= new Calcu();
	
		
//	 	Child class reference and base class object (invalid scenario)
	// User cannot create object of interface class , it has abstract method(which dont have body)
		//	Advancecal3 ob1=new Calcu();

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
