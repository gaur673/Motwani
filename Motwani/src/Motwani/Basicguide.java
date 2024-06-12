package Motwani;

public class Basicguide {

	int x=90;  //State of class
	int y=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Progrem starting");
		Basicguide bg= new Basicguide();
		// if we create new object then, new object will create new memory for x,y and sum method
		bg.sum();
		System.out.println(bg.x);  //bg has allocate memory for x and y
		System.out.println(bg.y);
		
		
		
		System.out.println("Progrem ending");
		
		

	}
	// behavior of class
	public void sum() {
		int a=1;
		int b=10;
		int c= a+b;
		System.out.println("sum of 2 no."+c);
		
	}

}
