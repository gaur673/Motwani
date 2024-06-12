package StringDemo;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Welcome to Selenium webdriver world";
		
		String s1="welcome to Selenium webdriver world";
		
		boolean a= s.equalsIgnoreCase(s1);
		System.out.println(a);
		
		String s2="Welcome to Selenium webdriver world";
		
		String s3="Selenium";
		boolean a1= s2.contains(s3);
		System.out.println(a1);
		
		

	}

}
