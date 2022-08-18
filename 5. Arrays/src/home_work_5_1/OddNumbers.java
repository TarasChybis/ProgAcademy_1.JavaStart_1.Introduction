//An array {0,5,2,4,7,1,3,19} is given. 
//Write a program to count the odd digits in it.

package home_work_5_1;

import java.util.Arrays;

public class OddNumbers {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 0, 5, 2, 4, 7, 1, 3, 19 };

		int b = 0;

		for (int i = 0; i < arr1.length; i++) {
			if ((arr1[i] != 0) && (arr1[i] % 2 != 0)) {
				b = b + 1;
			}
		}
		System.out.println(b);
	}
}