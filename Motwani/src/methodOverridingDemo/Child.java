package methodOverridingDemo;

public class Child extends Parent
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ob1=new Child();
		ob1.display(); // Child method will be called
		
		
		Parent ob2=new Parent(); //only by this we can call Parent display method for rest it will always call child method
		ob2.display(); // parent method will be called
		
		
		Parent ob3=new Child();
		ob3.display(); // Child method will be called
		
		//Child ob1=new Parent();  invalid
		

	}
	
	
	public void display()
	{
		System.out.println(" i m in child class in display method");
	}
	
	public void display(String name)
	{
		System.out.println(" i m in child class in display method" + name);
	}
	
	

}
