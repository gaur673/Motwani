package Motwani;

public class InstanceVariable {
	
	int roll;
	double marks;
	
	public InstanceVariable(int a,double b)
	{
		this.roll=a;
		this.marks=b;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable iv= new InstanceVariable(2,50.4);
		iv.show();
		InstanceVariable iv1= new InstanceVariable(3,60.4);
		iv1.show();
		System.out.println(iv1.roll);// using non static instance variable in static method

	}
	
	public void show() {
		System.out.println("rollno is "+roll+" marks "+marks);
	}
	
	
}
