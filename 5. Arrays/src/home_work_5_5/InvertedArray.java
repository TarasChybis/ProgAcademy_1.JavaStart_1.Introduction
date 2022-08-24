//"Reverse array". That is, write a program that will rotate the underlying array 90, 180, 270 degrees clockwise. (You cannot use an additional array when executing a job.) The example shows the rotation of the array by 90 degrees - (3 hours).
//
//Before      [1, 2, 3, 4, 5, 6]                  Now       [1, 1, 1, 1, 1, 1]
//            [1, 2, 3, 4, 5, 6]                            [2, 2, 2, 2, 2, 2]
//            [1, 2, 3, 4, 5, 6]                            [3, 3, 3, 3, 3, 3]
//            [1, 2, 3, 4, 5, 6]                            [4, 4, 4, 4, 4, 4]
//            [1, 2, 3, 4, 5, 6]                            [5, 5, 5, 5, 5, 5]
//            [1, 2, 3, 4, 5, 6]                            [6, 6, 6, 6, 6, 6]

package home_work_5_5;

import java.util.Arrays;

public class InvertedArray {

	public static void main(String[] args) {

		int[][] array = new int[][] { 
			{ 1, 2, 3, 4, 5, 6 }, 
			{ 1, 2, 3, 4, 5, 6 }, 
			{ 1, 2, 3, 4, 5, 6 },
			{ 1, 2, 3, 4, 5, 6 }, 
			{ 1, 2, 3, 4, 5, 6 }, 
			{ 1, 2, 3, 4, 5, 6 } 
			};
	
		int size = array[0].length;
	
		for(int[] row:array) {
			System.out.println(Arrays.toString(row));
		}
	
		for(int i = 1; i < 4; i++) {
			int x;
			for (int j = 0; j < size / 2; j++) {
				for (int k = j; k < size - 1 - j; k++) {
					x = array[j][k];
					array[j][k] = array[size - 1 - k][j];
					array[size - 1 - k][j] = array[size - 1 - j][size - 1 - k];
					array[size - 1 - j][size - 1 - k] = array[k][size - 1 - j];
					array[k][size - 1 - j] = x;
				}
			}
			System.out.println();
			System.out.println("turn on " + i * 90 + " degrees");
			for (int[] row : array) {
				System.out.println(Arrays.toString(row));
			}
		}
	}
}