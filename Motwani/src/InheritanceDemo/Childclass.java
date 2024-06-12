package InheritanceDemo;

public class Childclass extends Baseclass
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// Child class reference and Child class object
		// this allow access of base and child class methods
		
		Childclass obj1= new Childclass();
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();
		
		
		// base class reference and base class object
		// this allow access of base class(parent) methods
		Baseclass obj2=new Baseclass();
		obj2.add();
		obj2.sub();
		
		
		//Base class reference and child class object
		//this allow access of base class objects
		Baseclass obj3=new Childclass();
		obj3.add();
		obj3.sub();
		
		// child class reference and child class object
		//Invalid scenario : child cannot hold parent
		
		//Childclass obj4= new Baseclass();
	
		
		
		

	}
	
	public void mul() 
	{
		System.out.println("i m in Child class & multiplication is 25330");
	}
	
	public void div() 
	{
		System.out.println("i m in Child class & div  is 330");
	}

}
