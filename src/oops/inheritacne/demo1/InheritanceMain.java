package oops.inheritacne.demo1;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vehicle vh = new Vehicle();
		vh.speed();
		vh.start();

		//Tightly Coupled
		Car cr = new Car();
		cr.carPrice();
		cr.speed();
		cr.start();
//		
		//loosely coupled
		Vehicle vc = new Car();
		vc.speed();
		vc.speed1();
		vc.speed2();
		vc.speed3();
	
	}

}
