package ConstructorDemo;

public class Marks {
	
	int result;
	
	public Marks(int a)// no argument
	{
		this.result=a; // or  result=a;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marks st=new Marks(90);  
		st.displayResult();
	}
	
	
	public void displayResult()
	{
		System.out.println("marks are "+ result);
	}

}
