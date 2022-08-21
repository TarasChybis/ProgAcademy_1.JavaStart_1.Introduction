//Implement a method that draws a rectangle of asterisks "*" on the screen - its parameters will be integers that describe the length and width of such a rectangle.

package home_work_6_3;

public class HW_6_3 {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		drawRectangle(a, b);
	}

	public static void drawRectangle(int h, int w) {
		for (int j = 1; j <= h; j++) {
			for (int i = 1; i <= w; i++) {
				if (i == 1 || i == w || j == 1 || j == h) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}