//3)Write a program that calculates and displays
//the circumference of a circle if its radius is read from the keyboard.v

package home_work_2_3;

import java.util.Scanner;

public class Circumference {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the radius of the circle r (cm):");
		double r = sc.nextDouble();

		double c;

		c = 2 * Math.PI * r;

		System.out.println("Circumference is " + c + " cm");
	}
}