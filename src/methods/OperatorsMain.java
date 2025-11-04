package methods;

public class OperatorsMain {
	
	public static void main(String[] args) {
		
		int sum = addition(12,50);
		int sub = subtraction(52,12);
		int multi = multiplication(12,10);
		int div = division(55,11);
		int modular = modular(60,4);
		
		System.out.println("The sum of two integers is : "+ sum);
		System.out.println("The sub of two integers is : "+ sub);
		System.out.println("The multi of two integers is : "+ multi);
		System.out.println("The div of two integers is : "+ div);
		System.out.println("The modular of two integers is : "+ modular);
		}
	
	static int addition(int a, int b) {
		return a + b;
	}
	static int subtraction(int a , int b) {
		return a - b;
	}
	static int multiplication(int a , int b) {
		return a * b;
	}

	static int division(int a, int b) {
		return a / b;
	}
	 static int modular(int a, int b) {
		 return a % b;
	 }
}
