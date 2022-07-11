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