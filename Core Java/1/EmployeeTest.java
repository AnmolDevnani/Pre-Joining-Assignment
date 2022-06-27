class Employee {
	private int eid;
	private String ename;
	private double esalary;
	
	public void setInfo(int eid, String ename, double esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		
	}
	
	public void showInfo() {
		System.out.println("Eid = " + eid);
		System.out.println("Ename = " + ename);
		System.out.println("Esalary = " + esalary);
	}
	
	// If esalary > 100000 then tax is 10% otherwise 5%
	
	public void computeTaxes() {
		double tax_amount = 0;
		if(esalary > 100000)
			tax_amount = 0.1 * esalary;
		else
			tax_amount = 0.05 * esalary;
		
		System.out.println("Tax Amount = " + tax_amount);
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.setInfo(10, "Amit", 200000);
		e.showInfo();
		e.computeTaxes();

	}

}