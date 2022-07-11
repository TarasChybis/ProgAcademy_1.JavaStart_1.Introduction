package lesson_2_2;

import java.util.Scanner; //Импортируем сканер, (подключаем сканер)

public class TotalSumPetrolKyivOdesaInteractiv {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Инициализируем сканер. Обозначаем Тип переменной "Scanner", указываем
												// сканеру откуда читать данные (System.in - с клавиатуры)
		System.out.println("Введите стоимость 1л топлива (UAH):"); // Если хотим, чтобы пользователь ввел переменую с
																	// клавиатуры
		double fuilPrice = sc.nextDouble();
		double fuilR = 8;
		System.out.println("Введите расстояние поездки (км):"); // Если хотим, чтобы пользователь ввел переменую с
																// клавиатуры
		int distance = sc.nextInt(); // Вместо значения переменной указываем Сканер. Тип сканера зависит от типа
										// переменной
		double totalSum;

		totalSum = fuilR / 100 * fuilPrice * distance * 2;

		System.out.println("Сумма поездки " + totalSum + " UAH");

	}

}
