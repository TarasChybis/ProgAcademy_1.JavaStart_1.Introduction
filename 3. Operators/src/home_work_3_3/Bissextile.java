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
