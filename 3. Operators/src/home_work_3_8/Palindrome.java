//A six-digit number is entered from the keyboard. Check if it is a palindrome (For example, the number 143341).

//Note: A palindrome is a number, word, or text that reads the same from left to right and from right to left. For example, these are the numbers 143341, 5555, 7117, etc.

package home_work_3_8;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int s;
		
		System.out.println("Enter a six-digit number (For example: 143341");
		s = sc.nextInt();
		
		a = s / 100000;
		b = s % 100000 / 10000;
		c = s % 10000 / 1000;
		d = s % 1000 / 100;
		e = s % 100 / 10;
		f = s % 10;
		
		if(s >= 99999 && s <= 999999) {
			if(a == f && b == e && c == d) {
				System.out.println("Palindrome");
			} else {
				System.out.println("Regular number");
			}
		} else {
			System.out.println("Enter a six-digit number");
		}
	}
}