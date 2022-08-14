//2)Write a program that calculates and displays
//area of a triangle if its sides are known.

package home_work_2_2;

public class AreaOfaTriangleHeronsFormulaOnTheScreen {

	public static void main(String[] args) {

		double a = 5.5;
		double b = 4.5;
		double c = 3.9;
		double s;
		double p;

		p = (a + b + c) / 2;

		s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println("Area of ​​a triangle " + s + " cm2");
	}
}