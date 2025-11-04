package Conditional.decisionmaking;

public class MarksIfMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marksMemo = 35;
		
		if(marksMemo >= 90) {
			System.out.println("A");
		} else if(marksMemo >= 75) {
			System.out.println("B");
		} else if(marksMemo >= 60) {
			System.out.println("C");
		} else if(marksMemo >= 45) {
			System.out.println("D");
		} else {
			System.out.println("Failed");
		}
	}

}
