//A program that calculates and displays the amount spent on fuel, if known: fuel price per 1 liter, consumption and travel distance

package lesson_2_1;

public class TotalSumPetrolKyivOdesa {

	public static void main(String[] args) {

		double fuilPrice = 32.0;
		double fuilR = 8;
		int distance = 420;
		double totalSum;

		totalSum = fuilR / 100 * fuilPrice * distance * 2;

		System.out.println(totalSum + " UAH");
	}
}