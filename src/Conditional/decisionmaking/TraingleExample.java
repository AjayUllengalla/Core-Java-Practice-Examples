package Conditional.decisionmaking;

public class TraingleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int side1 = 10, side2 = 2, side3 = 10;
		
		if(side1 == side1 && side2 == side3 && side3 == side1) {
			System.out.println("Equilateral Triangle");
		} else if(side1 == side2 || side2 == side3 || side3 == side1) {
			System.out.println("Isosceles Triangle");
		} else {
			System.out.println("Sccalene");
		}

	}

}
