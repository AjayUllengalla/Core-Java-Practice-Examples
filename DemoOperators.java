class DemoOperators {
public static void main (String [] args) {
int a = 40;
int b= 30;

System.out.println("Arthimetic Operator");
System.out.println("The Sum Of " + a + " + " + b + " = " + (a+b));
System.out.println("The Minus Of " + a + " - " + b + " = " + (a-b));
System.out.println("The Multiplication Of " + a + " * " + b + " = " + (a*b));
System.out.println("The Division Of " + a + " / " + b + " = " + (a/b));
System.out.println("The Modular Division of " + a + " % " + b + " = " + (a%b));
System.out.println(" ");

System.out.println("Assignment Operator");

System.out.println("The Sum of "+ a +" +=" + b +" : " +(a+=b));
System.out.println("The Sub of "+ a +" -=" + b +" : " +(a-=b));
System.out.println("The Multiplication of "+ a +" *=" + b +" : " +(a*=b));
System.out.println("The Sum of "+ a +" /=" + b +" : " +(a/=b));
System.out.println("The Modular Division of "+ a +" %=" + b +" : " +(a%=b));
System.out.println(" ");

System.out.println("Relational Operator");

System.out.println( a + " > " + b + " : " +(a>b));
System.out.println( a + " < " + b + " : " + (a<b)); 
a = 10;
b = 10;
System.out.println(a + " <= " + b + " : " +(a<=b)); 
System.out.println(a + " >= " + b + " : " +(a>=b)); 
System.out.println(a + " == " + b + " : " +(a ==b));
System.out.println(" ");

System.out.println("Logical Operator ");

int c = 55;
boolean result = a> b && b>c;

System.out.println(" The Biggest Number from " + a +" && " + b + " && " + c + " : "+ result);
result = a > b || b < c;

System.out.println(" The Biggest Number from " + a +" && " + b + " && " + c + " : "+ result);

System.out.println(" ");

System.out.println("Unary Operator ");

System.out.println("Pre Increment of " + a + " : " + (++a));
System.out.println("Post Increment of " + a + " : " + (a++));
System.out.println("Pre Increment of " + a + " : " + (++a));

}
}