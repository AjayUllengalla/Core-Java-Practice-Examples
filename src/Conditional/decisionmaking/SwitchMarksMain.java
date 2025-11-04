package Conditional.decisionmaking;

public class SwitchMarksMain {

	public static void main(String[] args) {
		// TODO Auto-generated method
		
		int marks = 66;
		int gradeDigit = marks /10;
		switch(gradeDigit) {
		case 9: {
			System.out.println("A Grade");
			break;
			
		}
		case 8: {
			System.out.println("B Grade");
			break;
			
		}

		case 7: {
			System.out.println("C Grade");
			break;
			
		}

		case 6: {
			System.out.println("D Grade");
			break;
			
		} default : System.out.println("Failed ");

		}

	}

}
