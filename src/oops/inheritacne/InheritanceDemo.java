package oops.inheritacne;

import oops.inheritacne.demo.SportsBike;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cars cr = new Cars();
		cr.start(200);
		cr.drive(); // it is Protetcted method it access in same method
		cr.carColor(300);
		cr.vehicleDesign();
		cr.vehicleColor();
		cr.start();
		
		//HondaCity Class Inherited from car class
		HondaCity hc = new HondaCity();
		hc.carPrice();
		hc.carColor(); 
		hc.drive();
//		hc.start(); // it is Vehicle Class
		
		//Bike Class that inherited from Vehicle
		
		Bike bk = new Bike();
		bk.bikePrice();
		bk.drive();
//		bk.start();
		bk.testDrive();
		
		//SportsBike
		
		SportsBike sp = new SportsBike();
		sp.drive();

	}

}
