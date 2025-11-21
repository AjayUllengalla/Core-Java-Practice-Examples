package oops.inheritacne;

public class Vehicle {
	
	int a =100;
	public void start(int a) {
		System.out.println("Hello From Vehicle start method");
		System.out.println("Using Method "+ a);
		System.out.println("Using this keyword: "+ this.a);
		System.out.println("");
		
	}
	 void start() {
		System.out.println("Hello from start method from Vehicle Class");
	}
	protected void drive() {
		System.out.println("Hello From Protected");
	}

	private void starting() {
		System.out.println("hello From Starting Protected");
	}
	
	final void vehicleDesign() {
		
		System.out.println("Hello Iam From Final Method");
	}
	static void vehicleColor() {
		System.out.println("Hell From Vehicle");
	}
}
