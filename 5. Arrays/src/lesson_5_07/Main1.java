package lesson_5_07;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 1, 2, 5, 71, 17, 15 };

//		int s = arr1.length;

//		System.out.println(arr1.length);
//		System.out.println(arr1[2]);
		
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
		
//		System.out.println("arr1 " + Arrays.toString(arr1));

//		int[] arr2 = Arrays.copyOfRange(arr1, 1, 4);
//		System.out.println("arr2 " + Arrays.toString(arr2));

//		Arrays.fill(arr1, 5);
//		System.out.println(Arrays.toString(arr1));
//		
		for (int element:arr1) {
			System.out.println(element);
		}
	}

}
