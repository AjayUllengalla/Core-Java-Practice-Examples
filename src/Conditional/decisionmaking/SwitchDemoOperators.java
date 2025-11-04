package Conditional.decisionmaking;

public class SwitchDemoOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 20,b=30;
		 char caseCharacter = '+';
		 
		 switch(caseCharacter) {
		 
		 case '+': {
			 System.out.println(a+b);
			 break;
		 } 
		 case '-': {
			 System.out.println(a-b);
			 break;
		 }
		 case '*': {
			 System.out.println(a*b);
			 break;
		 } 
		 case '/': {
			 System.out.println(a/b);
			 break;
		 }
		 case '%': {
			 System.out.println(a%b);
			 break;
		 }
		 default: {
			 System.out.println("There is no Matching Character");
		 };
		 
		 }
	}

}
