//Read an integer from the keyboard int w;
//Display on the screen as much * as the value of this variable.
//For example w=5
//
//*****
//The user enters an integer from the keyboard int h = 4;
//Need to draw a shape of the form
//
//   * 1 i
//  ** 2
// *** 3
//**** 4
//1234
//
// j

package lesson_4_5;
import java.util.Scanner;
public class Cycle_Exercise_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int h;

		System.out.println("Input h");
		h = sc.nextInt();

		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= h; j++) {
				if (j <= h - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}
}