package methodOverridingDemo;

public class ICICI extends RBI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICI ob1=new ICICI();
		ob1.homeLoanIntRate();
		

	}
	
	public void homeLoanIntRate()
	{
		System.out.println("interst rate is 9%");
	}

}
