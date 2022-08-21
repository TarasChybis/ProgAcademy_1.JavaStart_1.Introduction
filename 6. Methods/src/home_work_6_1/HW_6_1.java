//Write a method that will return the maximum number from an array of integers.

package home_work_6_1;

public class HW_6_1 {

	public static void main(String[] args) {
		int[] arr2 = new int[] { 1, 7, 15, -2, 33 };
		int[] arr3 = new int[] { 1, 7, 115, -2, 33 };
		int[] arr4 = new int[] { -1, -7, -15, -2 };
		int max2 = maxNumber(arr2);
		int max3 = maxNumber(arr3);
		int max4 = maxNumber(arr4);
		System.out.println(max2);
		System.out.println(max3);
		System.out.println(max4);
	}

	public static int maxNumber(int[] arr1) {
		int max = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (max < arr1[i]) {
				max = arr1[i];
			}
		}
		return max;
	}
}
	
//	public static void main(String[] args) {
//		int[] arr2 = new int[] { 1, 7, 15, -2, 33 };
//		int[] arr3 = new int[] { 1, 7, 115, -2, 33 };
//		int[] arr4 = new int[] { -1, -7, -15, -2 };
//		int max2 = maxNumber(arr2);
//		int max3 = maxNumber(arr3);
//		int max4 = maxNumber(arr4);
//		System.out.println(max2);
//		System.out.println(max3);
//		System.out.println(max4);
//	}
//
//	public static int maxNumber(int[] arr1) {
//		int max = -2147483648;
//		for (int i = 0; i < arr1.length; i++) {
//			if (max < arr1[i]) {
//				max = arr1[i];
//			}
//		}
//		return max;
//	}
//}