//A program that displays the day of the week by entering a number on the keyboard.

package lesson_3_2;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int day;

		System.out.println("Input day from 1 to 7");
		day = sc.nextInt();
		
		// Option: if - else if - else
		
		if(day==1) {
			System.out.println("Monday");
		} else if(day==2) {
			System.out.println("Tuesday");
		} else if(day==3) {
			System.out.println("Wednesday");
		} else if(day==4) {
			System.out.println("Thursday");
		} else if(day==5) {
			System.out.println("Friday");
		} else if(day==6) {
			System.out.println("Saturday");
		} else if(day==7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Input Error");
		}
		
		// Option: switch-case-break-default
		
		switch(day) {
		case 1: 
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4: 
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("Friday");
			break;
		case 6: 
			System.out.println("Saturday");
			break;
		case 7: 
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Input Error");
		}		
	}
}