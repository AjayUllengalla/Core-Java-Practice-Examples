class SwapOfTwo {
public static void main(String[] args) {

int a = 15;
int b = 25;

a = a + b;
b = a - b;
a = a - b;
System.out.println("the value of a is " + a);
System.out.println("the value of b is " + b);
}
}