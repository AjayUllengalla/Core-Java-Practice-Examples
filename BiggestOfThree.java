class BiggestOfThree {
public static void main(String [] args) {

int num1 = 12;
int num2 = 16;
int num3 = 10;

if(num1 > num2 && num1 > num3) {
System.out.println("The Biggest of Three Number is "+num1);
}
 else if(num2 > num3) {
System.out.println("The Biggest of three Number is " + num2);
}
else {
System.out.println("The Biggest of Three Number is " + num3);
}
}
}