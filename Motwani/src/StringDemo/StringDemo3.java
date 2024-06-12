package StringDemo;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Selenium-Hp-QTP-Grid";
		String[] a1=a.split("-");
		for(String a2: a1)
		{
			System.out.println(a2);
			
			if(a2.equalsIgnoreCase("selenium"))
			{
				System.out.println("Test passed");
			}
		}

	}

}
