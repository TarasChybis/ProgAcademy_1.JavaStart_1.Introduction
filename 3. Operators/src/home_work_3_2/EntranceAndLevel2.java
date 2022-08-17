//A program that will determine and display the entrance and floor if the apartment number is entered from the keyboard. Provided that there is a 9-storey building with 4 entrances, 4 apartments on one floor (Option 2).

package home_work_3_2;

import java.util.Scanner;

public class EntranceAndLevel2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int entrance;
		int level;
		int apartment;
		int sumEntrance = 4;
		int sumLevel = 9;
		int apartmentPerLevel = 4;
		int sumApartment = sumEntrance * sumLevel * apartmentPerLevel;
		int sumApartmentPerEntrance = sumLevel * apartmentPerLevel;
		
		System.out.println("Input apartment number");
		apartment = sc.nextInt();

		if (apartment >= 1 && apartment <= sumApartment) {
		entrance = (apartment - 1) / sumApartmentPerEntrance + 1;
			System.out.println("Entrance No. " + entrance);
		} else {
			System.out.println("In this house " + sumApartment + " apartments");
		}
		
		if (apartment >= 1 && apartment <= sumApartment) {
		level = ((apartment - 1) % sumApartmentPerEntrance / apartmentPerLevel + 1);
			System.out.println("Floor " + level);
		} 	
	}
}