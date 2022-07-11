//Напишите метод который реализует линейный поиск элемента в массиве целых чисел. Если такой элемент в массиве есть то верните его индекс, если нет то метод должен возвращать число - «-1»

package home_work_6_4;

import java.util.Scanner;

public class HW_6_4 {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 15, 23, 6, 7, 15 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		int a = sc.nextInt();
		System.out.print("index ");
		System.out.println(search(arr1, a));
	}

	public static int search(int[] arr1, int a) {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == a) {
				return i;
			} 
		}
		return -1;
	}
}
