//Ќаписать код дл€ возможности создани€ массива целых чисел (размер вводитс€ с клавиатуры) и возможности заполнени€ каждого его элемента вручную. ¬ыведите этот массив на экран.

package home_work_5_2;

import java.util.Scanner;
import java.util.Arrays;

public class CodeToCreateAnArray {

	public static void main(String[] args) {

		System.out.println("Enter a lenght of Array");
		Scanner sc = new Scanner(System.in);
		int lenght = sc.nextInt();
		int[] arr1 = new int[lenght];
		System.out.println("Fill the array");
		for (int i = 0; i < lenght; i++) {
			System.out.println("enter a " + i + " arrays element");
			arr1[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr1));
		
	}

}
