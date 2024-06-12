package Motwani;

public class Conditionstatement {
	
	public static void main(String[] args) {
		int a=100;
		
		if (a<110) {
			System.out.println(a);
		}
		
		else if(a<111) {
			System.out.println(a);
		}
		
		else {
			System.out.println("outpit");
		}
		
		String aa="Ms";
		if(aa.equalsIgnoreCase("Chrome")) {
			System.out.println("tcs execute in chrome");
		
		}
		else if(aa.equalsIgnoreCase("ms")) {
			System.out.println("ms");
		}
		
		else {
			System.out.println("tccs in firefox");
		}
		
		
		// Switch
		
		int b= 70;
		
		switch(b)
		{
		case 10:
			System.out.println("poor");
			break;
			
		case 20:
			System.out.println("not good");
			break;
			
		case 50:
			System.out.println("average");
			break;
			
		case 70:
			System.out.println("exellent");
			break;
			
		default:
			System.out.println("not to consider");
			
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
