//Write a method to read a two-dimensional array from a file (the size of the array is not known in advance, determine it yourself based on the data in the file).

package home_work_8_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class HW_8_4 {

	public static void main(String[] args) {
		File file = new File("matrix.txt");
		int [][]arr = scText(file);
		 for (int[] array : arr) {
	            for (int anInt : array) {
	                System.out.print(String.format("%-6.3s", anInt));
	            }
	            System.out.println();
		 }
	}

	public static int[][] scText(File file) {
		int [][] arr;
		int n = 0;
		try (Scanner sc = new Scanner(file)){
			for (;sc.hasNextLine();) {
				sc.nextLine();
				n++;
			}
		}catch (IOException e) {
			System.out.println(e);
		}
		arr = new int [n][];
		try (Scanner sc = new Scanner(file)){
			for (int i = 0; i < n; i++) {
			String [] line = sc.nextLine().split("\t");	
			arr[i] = new int [line.length];
			for (int j = 0; j < arr[0].length; j++) 
				arr[i][j] = Integer.parseInt(line[j].trim());
			}			
		}catch (IOException e) {
			System.out.println(e);
		}
		return arr;
	}
}

	
//	public static void main(String[] args) {
//		File file = new File("c.txt");
//		int[][] array = loadArrFromFile(file);
//		System.out.println(Arrays.deepToString(array));
//
//	}
//
//	public static int[][] loadArrFromFile(File file) {
//
//		int[][] arr;
//		int n = 0;
//
//		try (Scanner sc = new Scanner(file)) {
//			for (; sc.hasNextLine();) {
//				sc.nextLine();
//				n++;
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		arr = new int[n][];
//
//		try (Scanner sc = new Scanner(file)) {
//
//			for (int i = 0; i < n; i++) {
//
//				String[] tempArr = sc.nextLine().split("; ");
//
//				arr[i] = new int[tempArr.length];
//				
//				for (int j = 0; j < arr[i].length; j++) {
//					arr[i][j] = Integer.valueOf(tempArr[j]);
//				}
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println(e);
//		}
//
//		return arr;
//	}
//}