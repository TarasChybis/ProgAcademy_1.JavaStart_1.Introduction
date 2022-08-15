//A program that will determine and display the entrance and floor if the apartment number is entered from the keyboard. Provided that there is a 9-storey building with 4 entrances, 4 apartments on one floor (Option 1).

//There is a 9-storey building with 4 entrances. The entrance number starts with one. There are 4 apartments on one floor. Write a program that will get the apartment number from the keyboard and display on the screen on which floor, which entrance this apartment is located. If there is no such apartment in this house, then you need to inform the user about it.

package home_work_3_2;

import java.util.Scanner;

public class EntranceAndLavel1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int level;
		int apartment;
		int sumEntrance = 4;
		int sumLevel = 9;
		int apartmentPerLevel = 4;
		int sumApartment = sumEntrance * sumLevel * apartmentPerLevel;
		int sumApartmentPerEntrance = sumLevel * apartmentPerLevel;
		
		System.out.println("Input apartment number");
		apartment = sc.nextInt();

		if (apartment >= 1 && apartment <= sumApartmentPerEntrance) {
			System.out.println("Entrance No.1");
		} else if (apartment >= sumApartmentPerEntrance && apartment <= 2 * sumApartmentPerEntrance) {
			System.out.println("Entrance No.2");
		} else if (apartment >= 2 * sumApartmentPerEntrance && apartment <= 3 * sumApartmentPerEntrance) {
			System.out.println("Entrance No.3");
		} else if (apartment >= 3 * sumApartmentPerEntrance && apartment <= 4 * sumApartmentPerEntrance) {
			System.out.println("Entrance No.4");
		} else {
			System.out.println("In this house " + sumApartment + " apartments");
		}
				
		if (apartment >= 1 && apartment <= sumApartment) {
		level = ((apartment - 1) % 36 / apartmentPerLevel + 1);
			System.out.println("Floor " + level);
		}		
	}
}