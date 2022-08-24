//Given 12 salaries.
//1) Calculate and display the amount of salary for the year.
//2) Determine the average monthly salary.

package lesson_5_08;

import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 20000, 21500, 25000, 29600, 51000, 20000, 21500, 25000, 29600, 51000, 52700, 60000 };
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1.length);

		double sum = 0;

		for (int i = 0; i < arr1.length; i++) {
			sum = sum + arr1[i];
		}
		System.out.println(sum);

		double sumInAMonth = sum / arr1.length;
		
		String result = String.format("%.2f", sumInAMonth);
		System.out.println(result);
		
		System.out.printf("%.2f", sumInAMonth);
	}

}
