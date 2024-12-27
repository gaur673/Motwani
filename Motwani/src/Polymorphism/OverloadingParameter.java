package Polymorphism;


// Polymorphism means one thing in multiple form
// Polymorphism 2 type
// 1) Overloading - compile time or Early binding or static binding
//2) OverRidding - Runtime polymorphism or Late binding or dynamic bindling




// OverLoading
//number of argument
//type of argument
//order of argument

public class OverloadingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingParameter olp= new OverloadingParameter();
		olp.add(3, 4);
		olp.add(4, 6, 20);
		olp.add(3.4, 5.6);
		olp.add(5.5, 5);

	}
	
	// Number of Argument
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	// Number of Argument
	public void add(int a, int b, int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	
	
	// Type of Argument
	public void add(double a, double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	
	// Order of Argument .Also here return type should be change according to high order datatype. 
	// It is also know as upcasting or internal casting
	public void add(double a, int b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	

}
