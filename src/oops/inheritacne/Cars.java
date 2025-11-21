package oops.inheritacne;

public class Cars extends Vehicle{

	int a = 600;
	void carColor(int a) {		
		System.out.println("Hello Car Color");
		System.out.println("Using Method Call: "+a);
		System.out.println("using this keyword: "+ this.a);
		System.out.println("Using the super keywrod "+ super.a);
		System.out.println("");
	}
	
	protected void  carPrice() {
		System.out.println("Hello From Protected Class from Car");
	}
	
	static void vehicleColor() {
		System.out.println("Hello from car class");
	}
	void start() {
		System.out.println("Car Start Method from car class");
	}
}
