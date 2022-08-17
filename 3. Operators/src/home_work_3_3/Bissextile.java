//A program that determines and displays the number of days in a year if the user enters the year from the keyboard.

//Determine the number of days in the year that the user enters. A leap year has 366 days, while a normal year has 365. A leap year is determined by the following rule:
//A year is a leap year if it is divisible by 4 without a remainder, but if it is divisible by 100 without a remainder, it is not a leap year. However, if it is divisible by 400, it is a leap year.

package home_work_3_3;

import java.util.Scanner;

public class Bissextile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		
		System.out.println("Input year");
		year = sc.nextInt();
		
		if(year % 4 != 0) {
			System.out.println("365 days in year");
		}
		if(year % 4 == 0 && year % 100 != 0) {
			System.out.println("366 days in year");
		}
		if(year % 4 == 0 && year % 100 == 0) {
			System.out.println("365 days in year");
		}
		if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
			System.out.println("366 days in year");
		}	
	}
}