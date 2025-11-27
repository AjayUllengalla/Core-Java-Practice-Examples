package oops.abstraction;

public class AbstractionImple implements AbstractionDemo{

	@Override
	public void work() {
		System.out.println("Working on project...");
		Integer a = 15;
		Byte b = 110;
		System.out.println(a+b);
		
	}

	@Override
	public void test() {
		System.out.println("Working test ");
		
	}

	@Override
	public void display(int a) {
		System.out.println(a);
		
	}

	@Override
	public void test(int a, int c) {
		int sum = a * c;
		System.out.println(sum);
		
	}

	@Override
	public void display(String str) {
		System.out.println("The Name: "+ str);
		
	}

	@Override
	public void display(int[] arr) {
		int n = arr.length;
		int sum =0;
		for(int i=0;i<n;i++) {
			sum += arr[i];
		}
		System.out.println("the sum of arrays elements"+sum);
		
	}
	

	
	


}
