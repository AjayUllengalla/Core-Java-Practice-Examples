package oops.inheritacne.demo1;

public class Vehicle {
	
	int a =50;
	void start() {
		System.out.println("Hello from Vehicle Method");
		
	}
	protected void speed() {
		System.out.println("Hello from Vehicle Speed 150");
		System.out.println("from the vehicle class by loosely coupling" +a);
	}
	final void speed1() {
		System.out.println("Hello From Vehicle Speed1 150");
	}
	static void speed2() {
		System.out.println("Hello From Vehicle Speed2 150");
	}

	void speed3() {
		System.out.println("Hello from vehicle Class "+a);
	}
}
