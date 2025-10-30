package methods;

import java.util.Scanner;

public class MarksMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Marks");
		int marksValue =sc.nextInt();
		String result =marks(marksValue);
		System.out.println(result);
	}

	static String marks(int marks) {
		String grade = " ";
		if(marks >=90) {
			grade = "A Grade";
		}
		else if(marks >= 75) {
			grade = "B Grade";
		}
		else if(marks >= 60) {
			grade = "C Grade";
		}
		else if(marks >= 35) {
			grade = "D Grade";
		} else {
			return "Failed";
		}
		return grade;
	}
}
