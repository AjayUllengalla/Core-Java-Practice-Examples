package com.constructors;

public class ConstructorDemo {

	int c =100;
	 int h =100;
	 int g = 50;
	ConstructorDemo(){
		System.out.println("hello From Constructor");
		System.out.println();
	}
	ConstructorDemo(int a,int b){
		a = this.h;
		b=this.g;
		
	}
	
	void display() {
		System.out.println("a value: "+h);
		System.out.println("a value: "+g);
		
	}
	
//	ConstructorDemo(int c){
//		System.out.println(this.c);
//	}
//	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorDemo cd = new ConstructorDemo();
		cd.display();
		ConstructorDemo cd2 = new ConstructorDemo();
		ConstructorDemo cd1 = new ConstructorDemo(10,30);
		cd1.display();
		
		ConstructorDemo cd3 = new ConstructorDemo();
		cd3.display();
		ConstructorDemo cd6 = new ConstructorDemo();
		ConstructorDemo cd4 = new ConstructorDemo(60,50);
		cd4.display();
//		ConstructorDemo c2 = new ConstructorDemo(45);
		ConstructorDemo cd9 = new ConstructorDemo();
	}

}
