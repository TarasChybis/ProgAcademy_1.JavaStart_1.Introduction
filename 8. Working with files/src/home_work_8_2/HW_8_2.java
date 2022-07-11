//Напишите метод для сохранения в текстовый файл двухмерного массива целых чисел.

package home_work_8_2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class HW_8_2 {

	public static void main(String[] args) {
		
		int[][] arr = new int[][] { { 11, 22 }, { 33, 44 } };
		doubleArray(arr);

	}

	public static void doubleArray(int[][] arr) {
		File file = new File("doubleArray.txt");
		try (PrintWriter pw = new PrintWriter(file)) {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(Arrays.toString(arr[i]));
				pw.println(Arrays.toString(arr[i]));
			}
		} catch (IOException e) {
			e.getMessage();
		}
	}
}
