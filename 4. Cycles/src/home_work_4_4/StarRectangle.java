//Display a rectangle from *. Moreover, the height and width of the rectangle are entered from the keyboard. For example, below is a rectangle with a height of 4 and a width of 5.

package home_work_4_4;

import java.util.Scanner;

public class StarRectangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;
		int h;

		System.out.println("Input a");
		a = sc.nextInt();

		System.out.println("Input h");
		h = sc.nextInt();

		for (int j = 1; j <= h; j++) {
			
			for (int i = 1; i <= a; i++) {
				if (j == 1 || j == h || i == 1 || i == a) {
					System.out.print("*");
				} else {//if (j != 1 || j != h || i != 1 || i != a) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}