//A program that determines and assigns the Max value to the largest number entered from the keyboard.

package lesson_3_1;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int c;
		int max;

		System.out.println("Input a");
		a = sc.nextInt();

		System.out.println("Input b");
		b = sc.nextInt();

		System.out.println("Input c");
		c = sc.nextInt();

		max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}

		System.out.println("Max = " + max);
	}

}