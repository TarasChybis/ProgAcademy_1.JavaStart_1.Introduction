package lesson_5_09;

import java.util.Arrays;

public class Main3 {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 0, 5, 2, 4, 7, 1, 3, 19 };

		System.out.println(arr1.length);
		System.out.println(Arrays.toString(arr1));

		int count = 0;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != 0 && arr1[i] % 2 != 0) {
				count = count + 1;
			}

		}
		System.out.println(count);
	}

}
