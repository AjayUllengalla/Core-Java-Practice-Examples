package oops;

import java.util.Scanner;

public class EmployeeDetails {
	
	static void showEmployessDetails(Employee emp) {
		System.out.println("Employee Id: "+emp.getEmpId());
		System.out.println("Employee Name: "+emp.getEmpName());
		System.out.println("Employee Department: "+emp.getEmpDep());
		System.out.println("Employee Salary: "+emp.getEmpSalary());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Enter The Employee Id");
		int id = sc.nextInt();
		emp.setEmpId(id);
		System.out.println("Enter The Name Of The Employee");
		String empName = sc.next();
		emp.setEmpName(empName);
		System.out.println("Enter The Employee Department");
		String empDep = sc.next();
		emp.setEmpDep(empDep);
		System.out.println("ENter The EMployee Salary");
		double empSalary = sc.nextDouble();
		emp.setEmpSalary(empSalary);
		
		showEmployessDetails(emp);
	}

}
