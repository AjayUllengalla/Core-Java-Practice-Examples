package oops.inheritancepractice;

class Employee {
	
	String empName = "Ajay";
	int empId = 56413;
	
	void empName() {
		System.out.println("Employee Name: "+ empName);
		
	}
	void empId() {
		System.out.println("Employee Id :"+ empId);
	}
}

class Manager extends Employee{
	String dep = "IT";
	
	void dep() {
		System.out.println("Department "+ dep);
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		

		Manager md = new Manager();
		
		md.empName();
		md.empId();
		md.dep();
	}

}
