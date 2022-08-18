//Enter a line of text from the keyboard - implement a program to be able to count the number of 'b' characters in this line, and print the result to the screen.

package home_work_5_4;

import java.util.Scanner;
import java.util.Arrays;

public class AmountOfSymbols {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input string");

		String a = sc.nextLine();
		char[] t = a.toCharArray();

		System.out.println(Arrays.toString(t));

		int b = 0;

		for (int i = 0; i < t.length; i++) {
			if ((t[i] == 'b') || (t[i] == 'B')) {
				b = b + 1;
			}
		}
		System.out.println("b = " + b);
	}
}