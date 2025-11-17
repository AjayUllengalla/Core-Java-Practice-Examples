package oops;

public class StudentDetails {

	
	static void show(Student student) {
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
		System.out.println(student.getMobileNumber());
		System.out.println(student.getEmail());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st = new Student();
		st.setStudentId(1);
		st.setStudentName("Ajay");
		st.setMobileNumber(994965522);
		st.setEmail("ajay123@gmail.com");
		
		show(st);
		st.setStudentId(2);
		st.setStudentName("Mani");
		st.setMobileNumber(994965522);
		st.setEmail("mani123@gmail.com");
		show(st);
	}

}
