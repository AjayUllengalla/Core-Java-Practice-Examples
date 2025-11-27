package oops.polymorphism;

public class PolymorphismDemo2 extends  PolymorphismDemo {
	
	
	//method overriding --> Same method name with same parameters wit different Behavoiur
	void display() {
		System.out.println();
	}
	void display(int a) {
		System.out.println("Hello");
	}
	
	void display(int a, int b) {
		System.out.println("hello From Display");
	}
}
