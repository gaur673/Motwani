package abstractDemo;


// abstraction is a process of showing essential features and hiding the background details
//Any class with abstract keyword will be known as Abstract class
//If in class even single method is abstract then class will become Abstract class
//An Abstract class can contains abstract method and non abstract method as well
// We cannot create object of Abstract class



public abstract class ITDepart implements Emp{
	
	public abstract void salary();

	
	public void goodies() {
		System.out.println("laptop");
		
	}

	public void work() {
	
		System.out.println("Automation");
		
	}

}
