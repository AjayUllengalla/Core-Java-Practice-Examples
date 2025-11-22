package oops.inheritacne.demo1;

public class Car extends Vehicle{
	int a= 10;
	void carPrice() {
		System.out.println("Hello From car price");
		System.out.println(a);
		
	}
	
	public void speed() { 
		System.out.println("Hello from Class Car speed 100");
		
	}
	static void speed2() {
		System.out.println("Hello From Car Speed2 120");
	}

	void speed3(int a) {
		System.out.println("Hello from class");
		System.out.println(a);
		
	}
}
