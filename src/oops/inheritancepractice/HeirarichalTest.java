package oops.inheritancepractice;

class Shape {
	
	void shape() {
		System.out.println("Shape Class");
	}
}

class Circle extends Shape {
	void shape() {
		System.out.println("Circle Shape");
	}
}
class Rectangle extends Circle {
	void shape() {
		System.out.println("Rectangle Shape");
	}
}



public class HeirarichalTest {

	public static void main(String[] args) {
		
		Shape sh = new Shape();
		sh.shape();
		
		Circle c = new Circle();
		c.shape();
		
		Rectangle re = new Rectangle();
		re.shape();

	}

}
