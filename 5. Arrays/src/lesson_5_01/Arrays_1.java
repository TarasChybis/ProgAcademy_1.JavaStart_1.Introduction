//Create an array of 12 random salaries.
//Calculate the value of the average salary.

package lesson_5_01;

import java.util.Arrays;

public class Arrays_1 {

	public static void main(String[] args) {

		int[] money = new int[12];

		for (int i = 0; i < money.length; i++) {
			money[i] = (int) (20_000 + Math.random() * 10000);
		}
		System.out.println(Arrays.toString(money));
		
		int sum = 0;
		for (int i = 0; i < money.length; i++) {
			sum = sum + money[i];
		}
		System.out.println("Average = " + sum / money.length);
	}
}