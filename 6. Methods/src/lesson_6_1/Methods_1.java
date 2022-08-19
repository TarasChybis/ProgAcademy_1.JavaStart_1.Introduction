//Write the body of a method that will calculate and return the sum of squares that are passed as actual parameters.

package lesson_6_1;

public class Methods_1 {

	public static void main(String[] args) {
		double a = 1;
		double b = 2;
		double d = 3;

		double c = 5 + squareSum(a, b) + squareSum(a, b, d);
		System.out.println(c);
		
		drawLine('*', 10);
	}

	public static double squareSum(double x, double y) {
		double s = x * x + y * y;
		return s;
	}

	public static double squareSum(double x, double y, double z) {
		double s = x * x + y * y + z * z;
		return s;
	}

	public static void drawLine(char s, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(s);
		}
		System.out.println();
	}

}