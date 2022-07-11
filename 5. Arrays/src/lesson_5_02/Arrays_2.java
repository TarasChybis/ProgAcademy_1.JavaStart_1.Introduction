package lesson_5_02;

public class Arrays_2 {

	public static void main(String[] args) {

		int[][] b = new int[4][5];                     // Объявление
		for (int i = 0; i < b.length; i++) {           // Цикл по строкам
			for (int j = 0; j < b[0].length; j++) {    // Цикл по столбцам
				b[i][j] = i + j;                       // Заполнение значениями
				System.out.print(b[i][j] + " ");       // Вывод на экран
			}
			System.out.println();
		}

	}

}
