package Conditional.decisionmaking;

public class PersonEligibleOrNot {
	public static void main(String[] args) {
		
		int age = 22;
		String  dept = "B.tech";
		if( age >= 21) {
			if(dept == "B.tech") {
				System.out.println("Eligible for the Job");
			} else {
				System.out.println("Not Eligible For The Job");
			} 
		} else {
			System.out.println("Not Eligible For The Job");
		}
	}

}
