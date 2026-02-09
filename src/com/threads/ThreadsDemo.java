package com.threads;

public class ThreadsDemo {

	public static void main(String[] args) {
		
		Thread t1 = new Thread();
		// default thread count
		System.out.println(t1.activeCount());
		System.out.println(t1.currentThread().getName()); //name of thread
		
		Employee e1 = new Employee();
		Manager m1 = new Manager();
		m1.start();
		e1.start();
		System.out.println(e1.getName()); //name of thread
		System.out.println("Thread Count "+t1.activeCount());
		
		ThreadDemo2 th2 = new ThreadDemo2();
		Thread t3 = new Thread(th2);
		t3.start();
	}

}

//Thread creation by extending Thread class
class Employee extends Thread {
	@Override
	public void run() {
		System.out.println("hello this is employee Thread");
	}
}
class Manager extends Thread {
	
	@Override
	public void run() {
		System.out.println("hello this is Manager Thread");

	}
}
