package oops.inheritacne;


class Animal {
	void show() {
		System.out.println(" Iam Animal");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog is barking");
	}
}
class Cat extends Dog {
	void meaow() {
		System.out.println("Cat is Sounding Meow");
	}
	void show() {
		System.out.println("hello From Dog Class");
	}
}


public class MultilevelInheritance {

	
	public static void main(String[] args) {
		

		Cat ct = new Cat();
		ct.bark();
		ct.meaow();
		ct.show();
	
		Animal an = new Animal();
		an.show();
	}

}
