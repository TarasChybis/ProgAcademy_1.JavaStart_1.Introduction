//A program that checks if the four-digit number entered by the user on the keyboard is a lucky ticket. The user enters a four-digit number from the keyboard. The program checks if it is a “lucky ticket”.

//Note: a lucky ticket is a number in which - with an even number of digits in the number, the sum of the digits of its left half is equal to the sum of the digits of its right half. For example, consider the number 1322. Its left half is 13 and its right half is 22, and it is the lucky ticket (because 1+3=2+2).

package home_work_3_7;

import java.util.Scanner;

public class HappyTicket {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		int s;
		
		System.out.println("Enter a four-digit number (For example: 1322");
		s = sc.nextInt();
		
		a = s / 1000;
		b = s % 1000 / 100;
		c = s % 100 / 10;
		d = s % 10;
		
		if(a + b == c + d) {
			System.out.println("Happy ticket");
		} else {
			System.out.println("Regular number");
		}	
	}
}