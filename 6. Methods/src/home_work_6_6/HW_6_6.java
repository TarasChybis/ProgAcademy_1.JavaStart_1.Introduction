//Существуют такие последовательности чисел
//0,2,4,6,8,10,12     Арифметическая прогрессия
//1,4,7,10,13
//1,2,4,8,16,32       Геометрическая прогрессия
//1,3,9,27
//1,4,9,16,25         Степенной ряд
//1,8,27,64,125
//Реализуйте программу которая выведет следующий член этой 
//последовательности (либо подобной им). Например пользователь вводит 
//строку 0,2,4,6,8,10,12 ответом программы должно быть число 14. (6 часов)

package home_work_6_6;

import java.util.Scanner;
import java.util.Arrays;

public class HW_6_6 {

	public static void main(String[] args) {

		int array1[] = { 0, 2, 4, 6, 8, 10, 12 };
		int array2[] = { 1, 4, 7, 10, 13 };
		int array3[] = { 1, 2, 4, 8, 16, 32 };
		int array4[] = { 1, 3, 9, 27 };
		int array5[] = { 1, 4, 9, 16, 25 };
		int array6[] = { 1, 8, 27, 64, 125 };
		int array7[] = { 1, 2, 5, 10, 20 };

		nextElement(array1);
		nextElement(array2);
		nextElement(array3);
		nextElement(array4);
		nextElement(array5);
		nextElement(array6);
		nextElement(array7);
	}

//Метод выводит на экран следующий элемент или что не нашел зависимость
	public static void nextElement(int[] array) {
		double[] koef = new double[array.length - 1];
		boolean b = true;
		System.out.print("Next element of sequence " + Arrays.toString(array));
		if (nextElementArifmetic(array, koef, b) != -1) {
			System.out.println(" is " + nextElementArifmetic(array, koef, b));
		} else if (nextElementMultiple(array, koef, b) != -1) {
			System.out.println(" is " + nextElementMultiple(array, koef, b));
		} else if (nextElementExp2(array, koef, b) != -1) {
			System.out.println(" is " + nextElementExp2(array, koef, b));
		} else if (nextElementExp3(array, koef, b) != -1) {
			System.out.println(" is " + nextElementExp3(array, koef, b));
		} else {
			System.out.println(" can't be found");
		}
	}

	// Метод проверяет последовательноть по формуле Х в кубе.
	// если зависимость найдена - возвращает следующий элемент,
	// если зависимость не найдена - возвращает -1.
	public static int nextElementExp3(int[] array, double[] koef, boolean b) {
		for (int i = 0; i < array.length - 1; i++) {
			koef[i] = (Math.pow(array[i + 1], 1.0 / 3) - Math.pow(array[i], 1.0 / 3));
		}
		for (int i = 0; i < koef.length - 1; i++) {
			if (koef[i] - koef[i + 1] >= 0.0000000001) {
				b = false;
			}
		}
		if (b) {
			return (int) ((Math.pow((int) (Math.pow((array[array.length - 1]), 0.333) + 2), 3)));
		} else {
			b = true;
		}
		return -1;
	}

	// Метод проверяет последовательноть по формуле Х в квадрате.
	// если зависимость найдена - возвращает следующий элемент,
	// если зависимость не найдена - возвращает -1.
	public static int nextElementExp2(int[] array, double[] koef, boolean b) {

		for (int i = 0; i < array.length - 1; i++) {
			koef[i] = Math.sqrt(array[i + 1]) - Math.sqrt(array[i]);
		}
		for (int i = 0; i < koef.length - 1; i++) {
			if (koef[i] != koef[i + 1]) {
				b = false;
			}
		}
		if (b) {
			return (int) ((Math.sqrt(array[array.length - 1]) + 1) * (Math.sqrt(array[array.length - 1]) + 1));
		} else {
			b = true;
		}
		return -1;
	}

	// Метод проверяет последовательноть по формуле Хi * X(i-1).
	// если зависимость найдена - возвращает следующий элемент,
	// если зависимость не найдена - возвращает -1.
	public static int nextElementMultiple(int[] array, double[] koef, boolean b) {

		for (int i = 0; i < array.length - 1; i++) {
			koef[i] = (double) array[i + 1] / (double) array[i];
		}
		for (int i = 0; i < koef.length - 1; i++) {
			if (koef[i] != koef[i + 1]) {
				b = false;
			}
		}
		if (b) {
			return array[array.length - 1] * array[array.length - 1] / array[array.length - 2];
		} else {
			b = true;
		}
		return -1;
	}

	// Метод проверяет последовательноть по формуле Хi + X(i-1).
	// если зависимость найдена - возвращает следующий элемент,
	// если зависимость не найдена - возвращает -1.
	public static int nextElementArifmetic(int[] array, double[] koef, boolean b) {

		for (int i = 0; i < array.length - 1; i++) {
			koef[i] = array[i + 1] - array[i];
		}
		for (int i = 0; i < koef.length - 1; i++) {
			if (koef[i] != koef[i + 1]) {
				b = false;
			}
		}
		if (b) {
			return array[array.length - 1] + array[array.length - 1] - array[array.length - 2];
		} else {
			b = true;
		}
		return -1;
	}
}

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Введите числовую последовательность через запятую");
//		String str = sc.nextLine();
//		print(arr(str));
//	}
//
//	public static int[] arr(String str) {
//		String[] words = str.split(",");
//		int[] arr = new int[words.length];
//		for (int i = 0; i < words.length; i++) {
//			int n = Integer.valueOf(words[i]);
//			arr[i] = n;
//		}
//		return arr;
//	}
//
//	public static void print(int[] i) {
//		int n1 = arifmeticMethod(i);
//		int n2 = geometricMethod(i);
//		int n3 = powerSeries(i);
//		if (n1 > 0) {
//			System.out.println(n1);
//		} else if (n2 > 0) {
//			System.out.println(n2);
//		} else if (n3 > 0) {
//			System.out.println(n3);
//		} else {
//			System.out.println("I do not understand");
//		}
//	}
//
//	public static int powerSeries(int[] array) {
//		if (array.length != 0) {
//			int[] count = new int[(array[1] / 2) + 1];
//			for (int j = 0; j <= (array[1] / 2); j++) {
//				for (int i = 1; i <= array.length; i++) {
//					if (Math.pow(i, j) == array[i - 1]) {
//						count[j] += 1;
//					}
//				}
//			}
//			int max = array[0];
//			int counts = 0;
//			for (int i = 0; i < count.length; i++) {
//				if (count[i] > max) {
//					max = count[i];
//					counts = i;
//				}
//			}
//			if (array.length == max) {
//				return (int) Math.pow(array.length + 1, counts);
//			} else {
//				return -1;
//			}
//		} else {
//			return -1;
//		}
//	}
//
//	public static int geometricMethod(int[] array) {
//
//		if (array.length != 0) {
//			try {
//				int count = 0;
//				int arrLength = array.length;
//				int[] a = new int[2];
//				for (int i = 0; i < arrLength - 2; i++) {
//					a[0] = array[i + 1] / array[i];
//					a[1] = array[i + 2] / array[i + 1];
//					if (a[0] == a[1]) {
//						count++;
//					}
//				}
//				if (count == array.length - 2) {
//					int num = array[0] * (int) Math.pow(a[1], arrLength);
//					return num;
//				} else {
//					return -1;
//				}
//			} catch (ArithmeticException e) {
//				return -1;
//			}
//		}
//		return -1;
//	}
//
//	public static int arifmeticMethod(int[] array) {
//		if (array.length != 0) {
//			int count = 0;
//			int arrLength = array.length;
//			int[] a = new int[2];
//			for (int i = 0; i < arrLength - 2; i++) {
//				a[0] = array[i + 1] - array[i];
//				a[1] = array[i + 2] - array[i + 1];
//				if (a[0] == a[1]) {
//					count++;
//				}
//			}
//			if (count == array.length - 2) {
//				int num = array[0] + arrLength * a[1];
//				return num;
//			} else {
//				return -1;
//
//			}
//		} else {
//			return -1;
//		}
//	}
//}
