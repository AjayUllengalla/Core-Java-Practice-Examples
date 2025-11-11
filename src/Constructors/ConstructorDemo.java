package Constructors;

public class ConstructorDemo {

	 int a;
	int b;
	ConstructorDemo(){
		System.out.println("Hello From Constructor");
	}
	
	ConstructorDemo(int a,int b){
		this.a =a;
		this.b= b;
		
	}
	 void display() {
		System.out.println("Display Method");
		System.out.println("value of a is:"+a);
		System.out.println("value of a is:"+b);
	}
	
//	ConstructorDemo(){
//		System.out.println("value of a is:"+a);
//		System.out.println("value of a is:"+b);
//	}
}
