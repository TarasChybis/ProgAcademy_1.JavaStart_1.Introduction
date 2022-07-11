// Дан массив {0,5,2,4,7,1,3,19} - написать программу для подсчета нечетных цифер в нем.

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
