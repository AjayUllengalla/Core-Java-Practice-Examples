package oops.encapusulation;

public class StudentDetails {

	
	static void show(Student student,Employee emp) {
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
		System.out.println(student.getMobileNumber());
		System.out.println(student.getEmail());
		System.out.println(emp.getEmpName());
	}
	public static void main(String[] args) {
		

		Student st = new Student();
		st.setStudentId(1);
		st.setStudentName("Ajay");
		st.setMobileNumber(994965522);
		st.setEmail("ajay123@gmail.com");
		Employee emp = new Employee();
		
		emp.setEmpName("Ajju");
		show(st,emp);
		st.setStudentId(2);
		st.setStudentName("Mani");
		st.setMobileNumber(994965522);
		st.setEmail("mani123@gmail.com");
		show(st,emp);
		
	}

}
