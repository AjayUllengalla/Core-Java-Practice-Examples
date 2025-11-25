package oops.polymorphism;

public class PolymorphismDemo2 extends  PolymorphismDemo {
	
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
