//“Перевернуть массив” . Т.е. написать программу, которая повернет базовый массив на 90, 180, 270 градусов по часовой стрелке. (При выполнении задания использовать дополнительный массив нельзя). В примере показан поворот массива на 90 градусов - (3 часа).
//
//Было      [1, 2, 3, 4, 5, 6]                  Стало       [1, 1, 1, 1, 1, 1]
//          [1, 2, 3, 4, 5, 6]                              [2, 2, 2, 2, 2, 2]
//          [1, 2, 3, 4, 5, 6]                              [3, 3, 3, 3, 3, 3]
//          [1, 2, 3, 4, 5, 6]                              [4, 4, 4, 4, 4, 4]
//          [1, 2, 3, 4, 5, 6]                              [5, 5, 5, 5, 5, 5]
//          [1, 2, 3, 4, 5, 6]                              [6, 6, 6, 6, 6, 6]

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
			System.out.println("превернуть на " + i * 90 + " градусов");
			for (int[] row : array) {
				System.out.println(Arrays.toString(row));
			}
		}
	}

}
