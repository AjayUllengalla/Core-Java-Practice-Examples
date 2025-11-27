package oops.abstraction;

public class AbstarctionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractionDemo ab = new AbstractionImple();
		ab.test();
		ab.work();
		ab.display(156);
		ab.display("Ajay");
		ab.test(15,65);
		
		int [] arr = {2,4,5,6,7};
		ab.display(arr);
	}

}
