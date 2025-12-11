package collectionFramwork.studentManagement;

public interface StudentServices {

	void mainMenu();
	Student createStudent();
	Student getAllStudent() throws StudentExceeption;
	Student getStudentById();
	Student removeStudentById();
	Student updateStudentById(Student sDetails);

}
