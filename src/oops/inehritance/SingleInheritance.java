package oops.inehritance;


class Ball {
	void display() {
		System.out.println("Hello Fromm Parent Class");
	}
}
class Bat extends Ball {
	void show() {
		System.out.println("Helleo From Child Class");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		

		Bat bt = new Bat();
		bt.show();
		bt.display();
	}
	
}



