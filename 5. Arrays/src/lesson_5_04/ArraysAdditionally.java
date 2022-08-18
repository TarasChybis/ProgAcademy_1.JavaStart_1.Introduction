//Working with arrays

package lesson_5_04;

import java.util.Arrays;

public class ArraysAdditionally {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 7, 2, 10, -1, 0 };

//		Additional functions for working with arrays
		

//		CONVERSION - display array data on the screen
//		Arrays.toString(which array is being converted);
		System.out.println("arr1 " + Arrays.toString(arr1));
				
		
//		COPYING
//		Arrays.copyOfRange(which array is being copied, start index, end index);
		int[] arr2 = new int[3];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i + 1];
		}
		System.out.println("arr2 " + Arrays.toString(arr2));
//		Or
		int[] arr3 = Arrays.copyOfRange(arr1, 1, 4); // [s, f)
		System.out.println("arr3 " + Arrays.toString(arr3));

		
//		COPYING AND ENLARGING
//		Arrays.copyOf(which array is copied, the new size);
		int[] arr4 = Arrays.copyOf(arr1, 12);
		System.out.println("arr4 " + Arrays.toString(arr4));
		
		
//		SORTING
//		Arrays.sort(which array is sorted);
//		Arrays.sort(which array is being sorted, start index, end index);
		Arrays.sort(arr3);
		System.out.println("arr3 " + Arrays.toString(arr3));
		
		
//		Filling
//		Arrays.fill(which array is being filled with what is being filled);
		Arrays.fill(arr1, 7);
		System.out.print("arr1 " + Arrays.toString(arr1));	
	}
}