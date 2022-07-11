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
			System.out.println("Подъезд №1");
		} else if (apartment >= sumApartmentPerEntrance && apartment <= 2 * sumApartmentPerEntrance) {
			System.out.println("Подъезд №2");
		} else if (apartment >= 2 * sumApartmentPerEntrance && apartment <= 3 * sumApartmentPerEntrance) {
			System.out.println("Подъезд №3");
		} else if (apartment >= 3 * sumApartmentPerEntrance && apartment <= 4 * sumApartmentPerEntrance) {
			System.out.println("Подъезд №4");
		} else {
			System.out.println("В данном доме " + sumApartment + " квартиры");
		}
				
		if (apartment >= 1 && apartment <= sumApartment) {
		level = ((apartment - 1) % 36 / apartmentPerLevel + 1);
			System.out.println("Этаж " + level);
		}		

	}
	
}
