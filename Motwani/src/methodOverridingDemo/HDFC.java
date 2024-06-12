package methodOverridingDemo;

public class HDFC extends RBI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI ob1=new RBI();
		ob1.homeLoanIntRate();
		

	}
	
	public void homeLoanIntRate()
	{
		System.out.println("interst rate is 11%");
	}

}
