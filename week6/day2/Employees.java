package week6.day2;

public class Employees extends Company{

	int empId;
	String empName;
	boolean isActive;

	Employees() {
		System.out.println("default constructor");
	}
	
	Employees(int id,String name){
		empId = id;
		empName = name;
		System.out.println("Parameterized constructor");
		
	}

	public void empDetails() {
		System.out.println("employee detail");

	}

	public static void main(String[] args) {
		Employees emp1 = new Employees();

		System.out.println(emp1.empId);
		System.out.println(emp1.empName);
		System.out.println(emp1.isActive);

	}

}
