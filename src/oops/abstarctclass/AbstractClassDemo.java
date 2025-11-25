package oops.abstarctclass;

public abstract class AbstractClassDemo {

	
	abstract void display();
	abstract void show();
	abstract  void more();
	
	void work() {
		System.out.println("Hello From Abstract Class");
	}
	protected void test() {
		System.out.println("hello from tests method from abstract class");
	}
}
