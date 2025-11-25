package oops.interfacePackage;

public interface InterfaceDemoMain2 {

	void shows();
	
	default void methodTest() {
		System.out.println("");
	}
	
	static void displays() {
		System.out.println();
	}
}
