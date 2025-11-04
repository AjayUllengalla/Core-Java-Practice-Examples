class LeapYear {
public static void main(String[] args) {

int  year = 2024;

if(year / 4 == 0 ) {

if( year / 100 == 0 ) {
if( year / 400 == 0 ) {
System.out.println("The Given Year is Leap Year");
}
} else {
System.out.println("Not a Leap year");
}
System.out.println("The Given Year is Leap Year");
} 
else {
System.out.println("Not A Leap Year");
}
}
}