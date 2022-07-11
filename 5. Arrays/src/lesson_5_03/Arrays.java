package lesson_5_03;

public class Arrays {

	public static void main(String[] args) {
		
		// Тип C++ подход
	
		double arr1[]; // одномерный массив
		double arr2[][]; // двумерный массив
		double arr3[][][]; // трехмерный массив
		double arr4[][][][]; // четырехмерный массив

		// Тип Java подход

		int[] arr5; // одномерный массив
		int[][] arr6; // двумерный массив
		int[][][] arr7; // трехмерный массив
		int[][][][] arr8; // четырехмерный массив

		// Инициализация
		// Вариант 1 (когда знаем количество элементов, но не знаем чему они равны)

		int[] arr9;
		int size = 12;
		arr9 = new int[12];
		// Либо
		arr9 = new int[size];
		// Либо в одну строчку
		int[] arr10 = new int[12];

		// Инициализация
		// Вариант 2 (когда знаем количество элементов, и знаем чему они равны)

		int[] arr11;
		arr11 = new int[] { 7, 2, 10, -1, 0 };

		// Либо в одну строчку

		int[] arr12 = new int[] { 7, 2, 10, -1, 0 };

		// Либо в одну строчку сокращенно

		int[] arr13 = { 7, 2, 10, -1, 0 };

		// Для того, что бы считать значение из массива
		
		int temp1 = arr13[2];
		System.out.println(temp1);
		
		// Для того, что бы переписать значение из массива
		
		arr13[2] = 15;
		int temp2 = arr13[2];
		System.out.println(temp2);
		
		// Длину массива можно узнать
		
		int s = arr13.length;
		System.out.println(s);
		
		// Вывести цифры из всего массива
		
		for (int i = 0; i < arr13.length; i++) {
			System.out.println(arr13[i]);
		}
		
		// Увеличим на единицу каждое значение массива
		
		for (int i = 0; i < arr13.length; i++) {
			arr13[i] = arr13[i] + 1;
		}
		for (int i = 0; i < arr13.length; i++) {
			System.out.println(arr13[i]);
		}
		
		// Для того, что бы узнать класс объекта
		
		System.out.println(arr13.getClass()); // объект по этой ссылке принадлежит классу для хранения массива интов
		
		// Если ссылку вывести на экран, то автоматически запускается метод toString
		
		System.out.println(arr13);
	}
} 
