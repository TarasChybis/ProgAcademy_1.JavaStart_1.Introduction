package home_work_2_3;

import java.util.Scanner;

public class Circumference {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("¬ведите радиус круга r (см):");
		double r = sc.nextDouble();

		double c;

		c = 2 * Math.PI * r;

		System.out.println("ƒлина окружности " + c + " см");

	}

}
