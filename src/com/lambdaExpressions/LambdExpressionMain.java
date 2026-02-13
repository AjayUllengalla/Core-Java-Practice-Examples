package com.lambdaExpressions;

public class LambdExpressionMain {

	public static void main(String[] args) {
		
		
			//Anonymous class
			Car c1 = new Car() {
				@Override
				public void drive() {
					System.out.println("Car name");
				}
			};
			c1.drive();
		
		//Lambda Expressions
			Car c2 = () -> {
				System.out.println("From Lambda Expression");
			};
		
			c2.drive();
		
			Car c3 = () -> System.out.println("From Single Line lambda Expression");
			c3.drive();
			
			CarExample cEx = (speed,carName) ->{  // Multiple Arguments 
	//			 speed = 200;
	//			 carName = "Audi";
				 System.out.println("Speed of the car is "+ speed + " Car");
				 System.out.println("Car Name is : "+ carName);
				 if(speed > 100)
					 System.out.println("Rash Driving");
				 else 
					 System.out.println("Normal Driving");
			};
			cEx.carNameAndSpeed(200,"BMW");
			
			Car2 cr1 = speed -> { //Single Arguments
				return speed;
			};
			System.out.println("Car2 example1 - "+ cr1.getSpeed(300));
			Car2 cr2 = speed -> speed;
			System.out.println("Car2 example2 - "+ cr2.getSpeed(400));
		}

}
@FunctionalInterface
interface Car {
	void drive();
}

@FunctionalInterface
interface Car2 {
	int getSpeed(int speed);
}