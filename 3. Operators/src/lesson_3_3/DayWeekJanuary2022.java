// A program that displays on the screen the day of the week by entering on the keyboard the number of January 2022.

package lesson_3_3;

import java.util.Scanner;

public class DayWeekJanuary2022 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int day;

		System.out.println("Input number from 1 to 31");
		day = sc.nextInt();

		// Option: switch-case-break-default
		
		if (day >= 1 && day <= 31) {
			
			switch (day % 7) {
			case 3:
				System.out.println("Monday");
				break;
			case 4:
				System.out.println("Tuesday");
				break;
			case 5:
				System.out.println("Wednesday");
				break;
			case 6:
				System.out.println("Thursday");
				break;
			case 0:
				System.out.println("Friday");
				break;
			case 1:
				System.out.println("Saturday");
				break;
			case 2:
				System.out.println("Sunday");
				break;
			}
						
		} else {
			System.out.println("Input Error");
		}

		// Option: if - else if - else
		
		if (day >= 1 && day <= 31) {

			if (day % 7 == 3) {
				System.out.println("Monday");
			} else if (day % 7 == 4) {
				System.out.println("Tuesday");
			} else if (day % 7 == 5) {
				System.out.println("Wednesday");
			} else if (day % 7 == 6) {
				System.out.println("Thursday");
			} else if (day % 7 == 0) {
				System.out.println("Friday");
			} else if (day % 7 == 1) {
				System.out.println("Saturday");
			} else if (day % 7 == 2) {
				System.out.println("Sunday");
			} 
			
		} else {
			System.out.println("Input Error");
		}
	}
}