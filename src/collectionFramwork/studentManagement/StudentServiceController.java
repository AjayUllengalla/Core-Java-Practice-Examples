package collectionFramwork.studentManagement;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentServiceController implements StudentServices{

	static Scanner sc = new Scanner(System.in);
	
	ArrayList<Student> studentList = new ArrayList<>();
	
	static int choice ;
	@Override
	public void mainMenu() {
//	while(true) {
//		try {
			System.out.println("Please Choose Option:");
			System.out.println("1.Add Student Details");
			System.out.println("2.Get All Student Details");
			System.out.println("3.Get Student Details By Id");
			System.out.println("4.Update Student Details Id");
			System.out.println("5.Remove Student Details Id");
			System.out.println("6.exits");
			choice = sc.nextInt();
//		} catch(InputMismatchException e) {
//			System.out.println("Please Enter Choice");
//			sc.nextLine();
//		}
//	}
			

		
	}

	@Override
	public Student createStudent() {
		Student stud = new Student();
		while(true) {
		try {
			
			System.out.println("Enter The Student Id: ");
			stud.setStudentId(sc.nextInt());
			System.out.println("Enter The Student Name: ");
			stud.setStudentName(sc.next());
			System.out.println("Enter The Student Age: ");
			stud.setStudentAge(sc.nextInt());
			System.out.println("Enter The Student Email: ");
			stud.setStudentEmail(sc.next());
			sc.nextLine();
			System.out.println("Enter The Student Mobile Number: ");
			stud.setMobileNumber(sc.nextLong());
			studentList.add(stud);
			break;
			
			
		} catch(InputMismatchException e) {
			System.out.println("Please Enter Correct values");
			sc.nextLine();
		}catch(NullPointerException e) {
			System.out.println("Null values not allowed");
		}
		
		}
		System.out.println();
		return stud;
	}

	@Override
	public Student getAllStudent() throws StudentExceeption{
		if(studentList.isEmpty()) {
			throw new StudentExceeption("Student List is Empty");
		} else {
			Student stud = new Student();
			System.out.println(studentList);
			return stud;

		}
}

	@Override
	public Student getStudentById() {
		System.out.println("Please Enter Student id to search");
		Student stud = null;
		int id = sc.nextInt();
		for(Student st: studentList) {
			if(st.getStudentId() == id) {
				stud = st;
			}
		}
		if(stud == null) {
			System.out.println("Student Not Found");
		} else {
			System.out.println(stud);
		}
		
		return stud;
	
	}

	@Override
	public Student removeStudentById() {
		System.out.println("Enter The Student Id To Remove");
		Student stud = null;
		int id = sc.nextInt();
		for(Student st: studentList) {
			if(st.getStudentId() == id) {
				stud = st;
				
			}
		}
		studentList.remove(stud);
		return stud;
		
		
	}

	@Override
	public Student updateStudentById(Student stud) {
		
		
		return stud;
	}

}
