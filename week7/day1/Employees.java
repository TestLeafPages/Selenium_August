package week7.day1;

public class Employees {
	
	int empId;
	String empName;
	String compName;
	
	Employees(){
		this(100,"Hari","Testleaf");
		System.out.println("default constructor");
		
	}
	
	Employees(int empId,String empName, String compName){
		
		this.empId = empId;
		this.empName = empName;
		this.compName = compName;
		
		//this.empDetails();
		
	}
	
	public void empDetails() {
		System.out.println("employee details");

	}
	
	

	public static void main(String[] args) {
		Employees emp1 = new Employees();
		
		System.out.println(emp1.empId);
		System.out.println(emp1.empName);
		System.out.println(emp1.compName);
		
		
		

	}

}
