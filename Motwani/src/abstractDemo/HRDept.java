package abstractDemo;

public class HRDept extends ITDepart{

	public static void main(String[] args) {
		
		HRDept hr=new HRDept();
		hr.work();
		hr.goodies();
		hr.salary();
		hr.bonus();
		
		ITDepart it=new HRDept();
		it.goodies();
		it.work();
		it.salary();
		
		// ITDepart it1=new ITDept();  
		// If your class is not fully implemented , then we will not allow you to create object
		// Interface is 100% abstract class

	}

	
	public void salary() {
		System.out.println("10Lpa");
		
	}
	
	
	public void bonus() {
		System.out.println("1 lac");
		
	}
	

}
