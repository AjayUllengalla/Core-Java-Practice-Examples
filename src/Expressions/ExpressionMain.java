package Expressions;

import java.util.Scanner;

public class ExpressionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int numa = 1;
		System.out.println("Enter The Length");
		int length = sc.nextInt();
		System.out.println("Enter sequence or even or odd");
		String str = sc.next().toLowerCase();
		String[] arr = { "*", "%", "+", "-" };
		int index = 0;

		
		switch (str) {

			case "sequence": {
				for (int i = 1; i <= length; i++) {
					if (i != length) {
						System.out.print(numa + "/" + i + " ");
						if (i <= length) {
							System.out.print(arr[index] + " ");
							index++;
							if (index == arr.length) {
								index = 0;
							}
						}

					} else if (i == length) {
						System.out.print(numa + "/" + i + " ");
					}
				}
				break;
			}
			case "even": {
				for (int i = 1; i <= length; i++) {

					if (i % 2 == 0) {
						System.out.print(numa + "/" + i + " ");

						if (i + 2 <= length) {
							System.out.print(arr[index] + " ");
							index++;
							if (index == arr.length) {
								index = 0;
							}
						}

					}

				}
				break;
			}
			case "odd": {

				for (int i = 1; i <= length; i++) {
					if (i % 2 != 0) {
						System.out.print(numa + "/" + i);

						// Check if there is another odd number after this one
						if (i + 2 <= length) {
							System.out.print(" " + arr[index] + " ");
							index++;
							if (index == arr.length) {
								index = 0;
							}
						}
					}
				}

				break;

			}

		}

	}

}
