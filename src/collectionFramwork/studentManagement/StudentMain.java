package collectionFramwork.studentManagement;

public class StudentMain {

	public static void main(String[] args) {


		StudentServiceController studentService = new StudentServiceController();
//		Student studentDetails = new Student();
		do {
			try {
			studentService.mainMenu();
			switch(StudentServiceController.choice) {
			
				case 1:studentService.createStudent();
						break;
				case 2:studentService.getAllStudent();
						break;
				case 3:studentService.getStudentById();
						break;
				case 4:studentService.removeStudentById();
						break;
				case 5:studentService.updateStudentById();
						break;
				default:System.out.println("Please Enter Correct Choice");
				}
			}catch(StudentExceeption e) {
				System.out.println(e.getMessage());
				System.out.println();
			} 
		} while(StudentServiceController.choice != 6);
		

	
	}

}
