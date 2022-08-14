//2)Write a program that calculates and displays
//area of a triangle if its sides are known.

package home_work_2_2;

import java.util.Scanner;

public class AreaOfaTriangleHeronsFormula {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of side A of the triangle ABC (cm):");
		double a = sc.nextDouble();
		System.out.println("Enter the length of side B of the triangle ABC (cm):");
		double b = sc.nextDouble();
		System.out.println("Enter the length of side C of the triangle ABC (cm):");
		double c = sc.nextDouble();
		double area;
		double p;

		p = (a + b + c) / 2;

		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println("Area of ​​a triangle " + area + " cm2");
	}
}