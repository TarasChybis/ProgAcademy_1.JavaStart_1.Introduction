package lesson_5_04;

import java.util.Arrays;

public class ArraysAdditionally {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 7, 2, 10, -1, 0 };

//		Дополнительные функции для работы с массивами
		

//		ПРЕОБРАЗОВАНИЕ - вывести данные массива на экран
//		Arrays.toString(какой массив преобразуется);
		System.out.println("arr1 " + Arrays.toString(arr1));
				
		
//		КОПИРОВАНИЕ
//		Arrays.copyOfRange(какой массив копируется, начальный индекс, конечный индекс);
		int[] arr2 = new int[3];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i + 1];
		}
		System.out.println("arr2 " + Arrays.toString(arr2));
//		Либо
		int[] arr3 = Arrays.copyOfRange(arr1, 1, 4); // [s, f)
		System.out.println("arr3 " + Arrays.toString(arr3));

		
//		КОПИРОВАНИЕ И УВЕЛИЧЕНИЕ РАЗМЕРА
//		Arrays.copyOf(какой массив копируется, новый размер);
		int[] arr4 = Arrays.copyOf(arr1, 12);
		System.out.println("arr4 " + Arrays.toString(arr4));
		
		
//		СОРТИРОВКА
//		Arrays.sort(какой массив сортируют);
//		Arrays.sort(какой массив сортируют, начальный индекс, конечный тндекс);
		Arrays.sort(arr3);
		System.out.println("arr3 " + Arrays.toString(arr3));
		
		
//		Заполнение
//		Arrays.fill(какой массив заполняется, чем заполняется);
		Arrays.fill(arr1, 7);
		System.out.print("arr1 " + Arrays.toString(arr1));
		
	}
}
