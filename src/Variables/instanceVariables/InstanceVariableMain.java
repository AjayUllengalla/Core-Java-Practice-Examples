package Variables.instanceVariables;

public class InstanceVariableMain {
	byte b;
	short sh = 5;
	int num = 950;
	float fl = 12.3f;
	long lo;
	double db;
	char c;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVariableMain instanceVariableMain  = new InstanceVariableMain ();
		instanceVariableMain.b = 10;
		instanceVariableMain.lo=12236664l;
		instanceVariableMain.db=25.2364;
		instanceVariableMain.c='b';
		
		System.out.println("The Instance Variables");
		System.out.println(" ");
		System.out.println(instanceVariableMain.b);
		System.out.println(instanceVariableMain.sh);
		System.out.println(instanceVariableMain.num);
		System.out.println(instanceVariableMain.fl);
		System.out.println(instanceVariableMain.lo);
		System.out.println(instanceVariableMain.db);
		System.out.println(instanceVariableMain.c);
//		System.out.println(instanceVariableMain.b);
		

	}

}
