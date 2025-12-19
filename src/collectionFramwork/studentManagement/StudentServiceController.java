package collectionFramwork.studentManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class StudentServiceController implements StudentServices{

	static Scanner sc = new Scanner(System.in);
	
	ArrayList<Student> studentList = new ArrayList<>();
	Map<Integer,Student> studentDetails = new HashMap<>();
	
	static int choice ;
	@Override
	public void mainMenu() {

			System.out.println("Please Choose Option:");
			System.out.println("1.Add Student Details");
			System.out.println("2.Get All Student Details");
			System.out.println("3.Get Student Details By Id");
			System.out.println("4.Remove Student Details Id");
			System.out.println("5.Update Student Details Id");
			System.out.println("6.exits");
			
			while(true) {
				try {
					choice = sc.nextInt();
					break;
				}catch(InputMismatchException e) {
					System.out.println("Please Enter in Number only");
					sc.nextLine();
				}
			}	
	}
	// ---- Adding Student Details -----
	@Override
	public Student createStudent() {
		Student stud = new Student();
		while(true) {
		try {
			while(true) {
				try {
					System.out.println("Enter The Student Id: ");
					stud.setStudentId(sc.nextInt());
					break;
				} catch(InputMismatchException e) {
					System.out.println("Please Enter Numbers Only");
					sc.nextLine();
					}
			}
			while(true) {
				try {
					System.out.println("Enter The Student Name: ");
					stud.setStudentName(sc.next());
					break;
				}catch(InputMismatchException e) {
					System.out.println("Enter Names");
					sc.nextLine();
				}
			}
			while(true) {
				try {
					System.out.println("Enter The Student Age: ");
					stud.setStudentAge(sc.nextInt());
					break;
				}catch(InputMismatchException e) {
					System.out.println("Enter The Age in number format only..");
					sc.nextLine();
				}
			}
			while(true) {
				try {
					System.out.println("Enter The Student Email: ");
					stud.setStudentEmail(sc.next());
					break;
				}catch(InputMismatchException e) {
					System.out.println("Enter in the Correct Format");
					sc.nextLine();
				}
			}
			while(true) {
				try {
					System.out.println("Enter The Student Mobile Number: ");
					stud.setMobileNumber(sc.nextLong());
					break;
				}catch(InputMismatchException e) {
					System.out.println("Enter in the Correct Format");
					sc.nextLine();
				}
			}
			
//			studentList.add(stud);
			studentDetails.put(stud.getStudentId(), stud); //adding into map
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
	// ---- All Student Details -----
	@Override
	public Student getAllStudent() throws StudentExceeption{
		
		if(studentDetails.isEmpty()) {
			throw new StudentExceeption("Student List is Empty");
		} else {
			//----- ArrayList Implementation
//			Student stud = new Student();
//			System.out.println(studentDetails);
//			return stud;
			
			// --- HashMap Implementation
			Student studDetails = new Student();
			System.out.println(studentDetails);
			return studDetails;

		}
}
		// ---- Student Details Finding By Id -----
	@Override
	public Student getStudentById() throws StudentExceeption{
		if(studentDetails.isEmpty()) {
			throw new StudentExceeption("Student List is Empty");
		} else {
			
			// ----- ArrayList ----
//		Student stud = null;
//		int id;
//		while(true) {
//		try {
//			System.out.println("Please Enter Student id to search");
//		id = sc.nextInt();
//		break;
//		} catch(InputMismatchException e) {
//			System.out.println("---- Please Enter Numbers Only ----");
//			sc.nextLine();
//		}
//		}
//		for(Student st: studentList) {
//			if(st.getStudentId() == id) {
//				stud = st;
//			}
//		}
//		if(stud == null) {
//			System.out.println("Student Not Found");
//		} else {
//			System.out.println(stud);
//		}
//		return stud;
		
		// ------ HashMap Using -----
		Student studDetails = null;
		int id = 0;
		while(true) {
			System.out.println("Please Enter Student id to search");
			try {
				id = sc.nextInt();
				break;
			} catch(InputMismatchException e) {
				System.out.println("Enter Numbers Only");
				sc.nextLine();
			}
		}
		studDetails = studentDetails.get(id);
		if(studDetails == null) {
			System.out.println("Student Details Not Found");
		} else {
			System.out.println(studDetails);
		}
		
		return studDetails;
		}
		
	
	}
	// ---- Student Details Removing By Id -----
	@Override
	public Student removeStudentById() throws StudentExceeption {
		if(studentDetails.isEmpty()) {
			throw new StudentExceeption("Student List Is Empty Please Try Again");
		} else {
			
		// ------ ArrayList Implementation ----	
//		System.out.println("Enter The Student Id To Remove");
//		Student stud = null;
//		int id = sc.nextInt();
//		for(Student st: studentList) {
//			if(st.getStudentId() == id) {
//				stud = st;
//				
//			}
//		}
//		studentList.remove(stud);
//		return stud;
		
		// ---- HashMap Implementation ----
		
			Student studDetails = null;
			int id =0;
			while(true) {
				try {
					System.out.println("Enter The Student Id To Remove");
					id = sc.nextInt();
					studDetails = studentDetails.remove(id); // remove Method()
					 if(studDetails == null) {
						 System.out.println("Student Not Found");
					 } else {
						 System.out.println("Removed Successfully");
					 }
					break;
				} catch(InputMismatchException e) {
					System.out.println("Enter Numbers Only...");
					sc.nextLine();
				}
			}
			 return studDetails;
		}		
	}
	// ---- Student Details Updating By Id -----
	@Override
	public Student updateStudentById() throws StudentExceeption {
		if(studentDetails.isEmpty()) {
			throw new StudentExceeption("Student List is Empty");
		} else {
		
//		Student stud = null;
//		while(true) {
//			try {
//				System.out.println("Enter The Student Id To Update");
//				int id = sc.nextInt();
//				for(Student st: studentList) {
//					if(st.getStudentId() == id) {
//						stud = st;
//						System.out.println("Enter The Student Name: ");
//						stud.setStudentName(sc.next());
//						System.out.println("Enter The Student Age: ");
//						stud.setStudentAge(sc.nextInt());
//						System.out.println("Enter The Student Email: ");
//						stud.setStudentEmail(sc.next());
//						sc.nextLine();
//						System.out.println("Enter The Student Mobile Number: ");
//						stud.setMobileNumber(sc.nextLong());
//						studentList.add(stud);
//					break;	
//					} else {
//						System.out.println("Not Found");
//					}
//				}
//
//			}catch(InputMismatchException e) {
//				System.out.println("---- Please Enter Numbers Only");
//				sc.nextLine();
//			}
//			return stud;
//		}
		// ----- HashMap Implementation -----
			Student studDetails = null;
			int id = 0;
			while(true) {
				try {
					System.out.println("Enter The Student Id To Update");
					id = sc.nextInt();
					if(studentDetails.containsKey(id)) {
					studDetails = studentDetails.get(id);
					while(true) {
					try {
						System.out.println("Enter The Student Name: ");
						studDetails.setStudentName(sc.next());
						break;
					} catch(InputMismatchException e) {
						System.out.println("Please Enter Name Only");
						sc.nextLine();
						}
					}
					while(true) {
						try {
							System.out.println("Enter The Student Age: ");
							studDetails.setStudentAge(sc.nextInt());
							break;
						} catch(InputMismatchException e) {
							System.out.println("Enter The Numbers Only");
							sc.nextLine();
						}
					}
					
					while(true) {
						try {
							System.out.println("Enter The Student Email: ");
							studDetails.setStudentEmail(sc.next());
							sc.nextLine();
							break;
						} catch(InputMismatchException e) {
							System.out.println("Enter in AlphaNumeric");
							sc.nextLine();
						}
					}
					while(true) {
						try {
							System.out.println("Enter The Student Mobile Number: ");
							studDetails.setMobileNumber(sc.nextLong());
							studentDetails.put(id, studDetails);
							break;
						}catch(InputMismatchException e) {
							System.out.println("Enter Numbers Only");
							sc.nextLine();
						}
					}
					System.out.println("Student Details Updated Successfully");
					break;
					} else {
						System.out.println("Studnt Id Not Matched please try again");
					}
				} catch(InputMismatchException e) {
					System.out.println("Enter Numbers Only");
					sc.nextLine();
				}
				
			}
			return studDetails;
		}
	}

}
