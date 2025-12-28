package oops.inheritancepractice;

class Animal{
	
	void eat() {
		System.out.println("Animal Eating");
	}
}

// Class extends 
class Dog extends Animal {
	
	void bark() {
		System.out.println("Dog is braking");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		
		Dog dg = new Dog();
		
		//calling Animal Class Method using Dog class Object
		dg.eat();
		//Dog class Method
		dg.bark();
		
		Animal an = new Animal();  //tightly Coupling
		an.eat();  //we can access only parent class com.methods only
		

		Animal ad = new Dog();
		ad.eat(); // bacause no com.methods same in Dog class so we can access only Animal class Method

	}

}
