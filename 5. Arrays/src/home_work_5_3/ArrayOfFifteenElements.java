//Create an array of random numbers (size 15 elements). Create a 2nd array twice as large, the first 15 elements should be equal to the elements of the first array, and fill the remaining elements with twice the value of the initial
//For example:
//Before → {1,4,7,2}
//Now    → {1,4,7,2,2,8,14,4}

package home_work_5_3;

import java.util.Arrays;
import java.util.Random;

public class ArrayOfFifteenElements {

	public static void main(String[] args) {

		int[] array = new int[15];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = 0 + random.nextInt(20);
		}
		System.out.println(Arrays.toString(array));
		
		int[] array2 = new int[30];
		int x = 0;
		for (int i = 0; i < array2.length; i++) {
			if (i < array.length) {
				array2[i] = array[i];
			} else {
				array2[i] = array[x]*2;
				x++;
			}
		}		
		System.out.println(Arrays.toString(array2));
	}
}
		
		
		
		
		
		
//		int[] arr1 = new int[] { 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4 };
//
//		System.out.println(Arrays.toString(arr1));
//		
////		int s = arr1.length;
////		System.out.println(s);
//	
//		int[] arr2 = Arrays.copyOf(arr1, 30);
//		
//		int[15] = 15;
//		
//		for (int i = 0; i < arr2.length; i++) {
//			if ((arr1[i] != 0) && (arr1[i] % 2 != 0)) {
//				b = b + 1;
//			}
//		}
//		
//		System.out.println(Arrays.toString(arr2));
//	}
//	
//}