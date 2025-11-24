package oops.inheritancepractice;


class Students{
	
	String studentName = "Ajay";
	int studentId=201;
	String branch = "CS";
	
}
class studentFullDetails extends Students{
	
	int sub1 =25;
	int sub2=56;
	int sub3=49;
	
	void display() {
		System.out.println(studentName+" "+studentId+" "+branch);
		System.out.println(sub1+" "+sub2+" "+sub2);
	}
}

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		studentFullDetails sd = new studentFullDetails();
		sd.display();
	}

}
