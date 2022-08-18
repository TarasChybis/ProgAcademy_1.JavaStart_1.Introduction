//Count an integer from the keyboard int w;
//Display as many * as the value of this variable in a line.
//For example w=5
//
//*****
//To print to the screen without a line feed, use System.out.print();

package lesson_4_3;

import java.util.Scanner;

public class Cycle_Exercise_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int w;
		
		System.out.println("Input w");
		w = sc.nextInt();
		
		for(int i = 1; i <= w; i++) {
			System.out.println("*");
		}	
	}
}