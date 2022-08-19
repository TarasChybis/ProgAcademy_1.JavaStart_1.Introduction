//Write a method that will calculate and return the sum of the elements of an array of integers that are passed as parameters.

package lesson_6_3;

//import java.util.Arrays;

public class Methods_3_SumArray {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 2, 0, 7, -1 };
		int s = sum(arr1);
		System.out.println(s);
	}

	public static int sum(int[] arr1) {
		int x = 0;
		for (int i = 0; i < arr1.length; i++) {
			x = x + arr1[i];
		}
		return x;
	}

}