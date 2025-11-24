package oops.inheritancepractice;

class Car {
	void start() {
		System.out.println("Car Starts ");
	}
}

class Maruti extends Car {
	
	void speed() {
		System.out.println("Maruthi Car Speed");
	}
}

public class VehicleTest {

	public static void main(String[] args) {
	
		Maruti mc = new Maruti();
		mc.speed();
		mc.start();

	}

}
