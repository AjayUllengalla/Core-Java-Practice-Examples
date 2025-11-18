package oops.inheritacne;

class Car {
	void display() {
		System.out.println("Hello From Parent");
	}
}
class Hyudai extends Car{
	void show() {
		System.out.println("Hello From Child1");
	}
}
class Bmw extends Car {
	void bmw() {
		System.out.println("Hello From BMW");
	}
}
public class HirarichalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bmw b = new Bmw();
		b.bmw();
		b.display();
		Hyudai hy = new Hyudai();
		hy.display();
		hy.show();

	}

}
