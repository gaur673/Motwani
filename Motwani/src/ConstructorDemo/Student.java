package ConstructorDemo;

public class Student {
	
	int result;
	
	public Student()// no argument
	{
		System.out.println("welcome to school");
	}
	
	
	public Student(String schoolName) // type of argument or parmetrized
	{
		System.out.println("welcome to "+ schoolName + " school");
	}
	
	
	public Student(int rank) // type of argument
	{
		System.out.println("welcome to school which rank is " + rank);
	}
	
	public Student(String schoolName, int rank) //order of argument
	{
		System.out.println("welcome to school");
	}
	
	public Student(int rank, String schoolName)//order of argument
	{
		System.out.println("welcome to school");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student("DPS");  //we call it compile time polymorphisum, as we know which constructor going to Compile
		st.displayResult();
		Student st1=new Student(1);

	}
	
	public void displayResult()
	{
		System.out.println("marks are "+ result);
	}

}
