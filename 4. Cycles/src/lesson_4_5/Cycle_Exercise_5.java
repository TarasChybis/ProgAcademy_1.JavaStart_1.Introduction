//Пользователь с клавиатуры вводит целое число int h = 4;
//Нужно нарисовать фигуру вида
//
//   * 1  i
//  ** 2
// *** 3
//**** 4
//1234 
//
//j

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
