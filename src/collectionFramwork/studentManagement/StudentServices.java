package collectionFramwork.studentManagement;

public interface StudentServices {

	void mainMenu();
	Student createStudent();
	Student getAllStudent() throws StudentExceeption;
	Student getStudentById() throws StudentExceeption;
	Student removeStudentById() throws StudentExceeption;
	Student updateStudentById() throws StudentExceeption;

}
