package week7.day1;

public class EmployeeDetails {
	
	int empId;
	String empName;
	static String compName ="TestLeaf";
		
	EmployeeDetails(int empId,String empName, String compName){
		
		this.empId = empId;
		this.empName = empName;
		this.compName = compName;
			
	}
	
	public static void empDetails() {
		System.out.println("static method");
	}
	
	/*
	 * public void printEmpDetails() { System.out.println(empId);
	 * System.out.println(empName); System.out.println(compName); }
	 */
	

	public static void main(String[] args) {
		EmployeeDetails emp1 = new EmployeeDetails(100,"Hari","TestLeaf");
				
		EmployeeDetails emp2 = new EmployeeDetails(200,"Prasad","TestLeaf Software Solutions");
		
		
		System.out.println(compName);
		
		//emp1.printEmpDetails();

		//emp2.printEmpDetails();
		
		
		

	}

}
