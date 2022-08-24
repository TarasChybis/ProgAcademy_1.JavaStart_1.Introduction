//Write a program that allow to fill an array with data entered from the keyboard.

package lesson_5_10;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Input a");
		int a = sc1.nextInt();
		int[] arr1 = new int[a];
		System.out.println(Arrays.toString(arr1));

		System.out.println("Input i from 0 to " + a);
		Scanner sc2 = new Scanner(System.in);
		String b = sc2.nextLine();
		char[] arr2 = b.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		char x = arr2[2];
		System.out.println(x);
	}

}
