package Parameter;

public class PassParameter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DynamicCalculator pp= new DynamicCalculator();
		int sum=pp.add(2, 4);
		System.out.println(sum);
		
		double subt=pp.sub(5.4, 10.6);
		System.out.println(subt);
		
		String fullname=DynamicCalculator.getMyfullName("Gaurav", "Chauhan");
		System.out.println(fullname);
	}
	
	

}
