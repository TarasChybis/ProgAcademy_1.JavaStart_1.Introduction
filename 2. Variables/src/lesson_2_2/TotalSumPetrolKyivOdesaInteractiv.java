//A program that calculates and displays the amount spent on fuel if the price for 1 liter of fuel and the travel distance are read from the keyboard

package lesson_2_2;

import java.util.Scanner; //Importing an additional package Scanner

public class TotalSumPetrolKyivOdesaInteractiv {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Create an object of class Scanner. We initialize the scanner. We designate the Type of the variable as "Scanner", indicate to the scanner where to read the data (System.in - from the keyboard)

		System.out.println("Enter the cost of 1 liter of fuel (UAH):");
		// If we want the user to enter a variable from the keyboard
		double fuilPrice = sc.nextDouble();
		double fuelConsumption = 8;

		System.out.println("Enter travel distance (km):");
		// If we want the user to enter a variable from the keyboard
		int distance = sc.nextInt(); // Instead of the value of the variable, specify the Scanner. Scanner type depends on variable type
		
		double totalSum;

		totalSum = fuelConsumption / 100 * fuilPrice * distance * 2;

		System.out.println("Travel amount " + totalSum + " UAH");
	}
}
