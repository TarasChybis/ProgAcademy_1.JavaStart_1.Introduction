package home_work_3_2;

import java.util.Scanner;

public class EntranceAndLevel {

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
			System.out.println("Подъезд № " + entrance);
		} else {
			System.out.println("В данном доме " + sumApartment + " квартиры");
		}
		
		if (apartment >= 1 && apartment <= sumApartment) {
		level = ((apartment - 1) % sumApartmentPerEntrance / apartmentPerLevel + 1);
			System.out.println("Этаж " + level);
		} 
		
	}

}
