package oops.abstarctclass;

public class AbstractClassDemo1 extends AbstractClassDemo{

	@Override
	void display() {
		System.out.println("hello From extended Class display method");
		
	}

	@Override
	void show() {
		System.out.println("Hello From Extended Class Show Method");
		
	}

	@Override
	void more() {
		System.out.println("Hello from extended class from more method");
		
	}
	
	public void test() {
		System.out.println("Hello test overided");
	}
	

}
