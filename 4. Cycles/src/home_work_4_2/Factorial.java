package home_work_4_2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		long product;

		System.out.println("Input n from 5 to 15");
		n = sc.nextInt();

		if (n > 4 && n < 16) {
			product = 1;
			for (int i = 1; i <= n; i++) {
				product = product * i;
			}
			System.out.println("n! = " + product);

		} else {
			System.out.println("Incorrect input. Please enter a number from 5 to 15");
		}
	}
}
