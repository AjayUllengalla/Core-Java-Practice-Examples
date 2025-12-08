package exceptions.thowthrows;

import java.util.InputMismatchException;

public class ThrowDemo {

	public static void main(String[] args) {


//		int age = 16;
//		try {
//		if(age < 18) {
//			
//			throw new ThrowThrowsExample("Age is must be greater than 18");
//		}
//		}catch(ThrowThrowsExample e) {
//			System.out.println(e.getMessage());
//		}
//		
		ThrowThrowsUsage thowsUsage = new ThrowThrowsUsage();
		try {
		thowsUsage.validation();
		thowsUsage .division();
		}catch( ThrowThrowsExample e) {
			System.out.println(e.getMessage());;
		}catch(InputMismatchException inputMismatch) {
			inputMismatch.printStackTrace();
		}
	
	}

}
