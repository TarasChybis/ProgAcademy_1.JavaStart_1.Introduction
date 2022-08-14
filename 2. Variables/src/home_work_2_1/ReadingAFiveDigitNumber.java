//1) Write a program that reads a 5 digit number from
//keyboard and displays the digits from which it consists. 
//For example: The number is read 54698
//Output (displays):5
//            		4
//            		6
//            		9
//            		8

package home_work_2_1;

import java.util.Scanner;

public class ReadingAFiveDigitNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number (for example: 54698):");
		int number = sc.nextInt();

		int digit1 = number / 10000;
		int digit2 = number % 10000 / 1000;
		int digit3 = number % 1000 / 100;
		int digit4 = number % 100 / 10;
		int digit5 = number % 10;

		System.out.println("Digit 1 - " + digit1);
		System.out.println("Digit 2 - " + digit2);
		System.out.println("Digit 3 - " + digit3);
		System.out.println("Digit 4 - " + digit4);
		System.out.println("Digit 5 - " + digit5);
	}
}