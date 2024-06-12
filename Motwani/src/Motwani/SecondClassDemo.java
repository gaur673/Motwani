package Motwani;

public class SecondClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		cal.sum();
		cal.sub();
		System.out.println(cal.hobby);
		
		Calculator.sum1();// if we have static method then , we need not to require object creation. We can directly call method using their class name
		Calculator.sub1();
		

	}

}
