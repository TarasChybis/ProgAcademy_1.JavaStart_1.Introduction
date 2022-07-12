package home_work_2_3;

import java.util.Scanner;

public class Circumference {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ââåäèòå ðàäèóñ êðóãà r (ñì):");
		double r = sc.nextDouble();

		double c;

		c = 2 * Math.PI * r;

		System.out.println("Äëèíà îêðóæíîñòè " + c + " ñì");

	}
}

3)Написать программу которая вычислит и выведет на экран 
длину окружности, если ее радиус считывается с клавиатуры.
