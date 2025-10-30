package operators;

public class RelationalOperatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 =10;
		int num2 = 15;
		
		System.out.println("The Given Integer "+ num1 +" > " + num2 +" is : " +(num1 > num2) );
		System.out.println("The Givem Integer  "+ num1 + " < " + num2 + " is : " +(num1 < num2));
		
		int var1 = 10;
		int var2 = 10;
		System.out.println("The Given Integer "+ var1 +" >= " + var2 + " is : "+ (var1 >= var2) );
		System.out.println("The Given Integer "+ var1 +" <= " + var2 + " is : "+ (var1 <= var2) );
		
		char charValue1= 'a';
		char charvalue2= 'b';
		System.out.println("The Given Character "+ charValue1 + " == " + charvalue2 +" is : "+ (charValue1 == charvalue2));
		charvalue2 = 'a';
		System.out.println("The Given Character "+ charValue1 + " == " + charvalue2 +" is : "+ (charValue1 == charvalue2));
		
		float varFloat1 = 1.25f;
		float varFloat2 = 2.5f;
		System.out.println("The Given value " + varFloat1 + " != " + varFloat2 + " is : " + (varFloat1 != varFloat2));
	}

}
