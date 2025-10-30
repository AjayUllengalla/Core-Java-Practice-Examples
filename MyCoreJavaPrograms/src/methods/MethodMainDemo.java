package methods;

public class MethodMainDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addTwoIntegers(20,100);
		addTwoIntegers();
		int sum = addition(20,50);
		System.out.println("with parameters and with return type: "+ sum);
		sum = addition();
		System.out.println("No parameters and with return type: "+ sum);
	}
	
	//with Parameters - no return Type
	static void addTwoIntegers(int a,int b) {
		int sum = a + b;
		System.out.println("With parameters: "+sum);
	}
	//no parameter-no return type
	static void addTwoIntegers() {
		int a =10,b=20;
		int sum = a +b;
		System.out.println("Without Parameters : "+sum);
	}
	
	//with parameters- with return type
	
	static int addition(int a,int b) {
		return a + b;
	}
	static int addition() {
		int a = 10,b=20;
		int sum = a+b;
		return sum;
	}
}
