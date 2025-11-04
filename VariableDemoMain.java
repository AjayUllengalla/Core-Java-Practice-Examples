class VariableDemoMain {

static int k;
static int i = 10;
int u = 19;
static byte b = 15;
double fl =1.5;
long lo;

public static void main(String[] args) {

k =20;
int k = 33;
System.out.println(k);
System.out.println(i);
k = 50;
System.out.println(k);

VariableDemoMain variableDemo = new VariableDemoMain();
System.out.println(variableDemo.u);

variableDemo.u = 18;
System.out.println(variableDemo.u);

System.out.println(b);
System.out.println(variableDemo.fl);
float fl = 1.25f;
System.out.println("Float Value");
System.out.println(fl);
variableDemo.lo = 5656655464l;
System.out.println("Long value");
System.out.println(variableDemo.lo);
}

}