package methodOverridingDemo;


// when parent class and child class has the same method, it knoows as method overridng
// here method should share same signature


public class SBI extends RBI implements Loan{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI ob1=new SBI();
		ob1.homeLoanIntRate();

	}
	
	public void homeLoanIntRate()
	{
		System.out.println("interst rate is 7%");
	}

	@Override
	public void homeLoan() {
		System.out.println("SBI providing home loan ");
		
	}

	@Override
	public void carLoan() {
		System.out.println("SBI providing car loan ");
		
	}

}
