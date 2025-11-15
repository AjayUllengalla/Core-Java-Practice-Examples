package tasksprograms;

//Write a program that prints a message using a static block before the main method executes. 
// Write a program where a static block initializes a static variable, and the main method prints the value of that variable.

public class StaticBlock {
	static int a;
	static {
		 a =50;
		System.out.println("Hello Static Block Executed");
		
	}
	
	// Write a program with two static blocks and observe the order in which they execute. Print a message in each block.
	static {
		System.out.println("Static Block 1 Executed");
	}
	static {
		System.out.println("Static blaock 2 Executed");
	}
	static {
		System.out.println("Static Block 3 Executed ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(a);
		StaticBlock st = new StaticBlock();
	}

}
