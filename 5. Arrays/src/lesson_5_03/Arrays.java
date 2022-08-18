package lesson_5_03;

public class Arrays {

	public static void main(String[] args) {
		
		// C++ type approach
	
		double arr1[]; // one-dimensional array
		double arr2[][]; // two-dimensional array
		double arr3[][][]; // 3D array
		double arr4[][][][]; // four-dimensional array

		// Java type approach

		int[] arr5; // one-dimensional array
		int[][] arr6; // two-dimensional array
		int[][][] arr7; // 3D array
		int[][][][] arr8; // four-dimensional array

		// Initialization
		// Option 1 (when we know the number of elements, but we don’t know what they are equal to)

		int[] arr9;
		int size = 12;
		arr9 = new int[12];
		// Or
		arr9 = new int[size];
		// Or one line
		int[] arr10 = new int[12];

		// Initialization
		// Option 2 (when we know the number of elements, and we know what they are equal to)

		int[] arr11;
		arr11 = new int[] { 7, 2, 10, -1, 0 };

		// Or one line

		int[] arr12 = new int[] { 7, 2, 10, -1, 0 };

		// Or one line abbreviated

		int[] arr13 = { 7, 2, 10, -1, 0 };

		// To read a value from an array
		
		int temp1 = arr13[2];
		System.out.println(temp1);
		
		// To overwrite a value from an array
		
		arr13[2] = 15;
		int temp2 = arr13[2];
		System.out.println(temp2);
		
		// You can find the length of an array
		
		int s = arr13.length;
		System.out.println(s);
		
		// Remove numbers from the entire array
		
		for (int i = 0; i < arr13.length; i++) {
			System.out.println(arr13[i]);
		}
		
		// Increment each array value by one
		
		for (int i = 0; i < arr13.length; i++) {
			arr13[i] = arr13[i] + 1;
		}
		for (int i = 0; i < arr13.length; i++) {
			System.out.println(arr13[i]);
		}
		
		// To find out the class of an object
		
		System.out.println(arr13.getClass()); // the object at this link belongs to a class for storing an array of ints
		
		// If the link is displayed on the screen, then the toString method is automatically launched
		
		System.out.println(arr13);
	}
} 