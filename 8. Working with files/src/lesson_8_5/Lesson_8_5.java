//Вывести на экран самое большое число из чисел, которые содержаться в файле

package lesson_8_5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lesson_8_5 {

	public static void main(String[] args) {

		File file = new File("a.txt");

		String result = loadStringFromFile(file);

		System.out.println(result);

		int maxNumber = getMaxNumberFromString(result);

		System.out.println("Max = " + maxNumber);

//Преобразование строки в число:
//Парсинг - когда из текста получаем число
//		int z = Integer.parseInt("120");
//		System.out.println(z);

	}

	public static int getMaxNumberFromString(String text) {
//		1.Вернуть массив на основании элементов заданого файла
//		Если нужно разбить строку на части есть метод split
//		В качестве По чем разбивать используем Символ перевода строки System.lineSeparator()
//		Создаем массив:
		String[] textNumbers = text.split(System.lineSeparator());
//		Предполагаем, что самое большое число - это то, что хранится на нулевом элементе
//		Из строки в число - Integer.parseInt()
		int max = Integer.parseInt(textNumbers[0]);
//		Проходимся по всем остальным элементам
		for (int i = 0; i < textNumbers.length; i++) {
			if (textNumbers[i].length() > 0) {
				int temp = Integer.parseInt(textNumbers[i]);
				if(temp>max) {
					max = temp;
				}
			}
		}
		return max;
	}

	public static String loadStringFromFile(File file) {
		String result = "";
		try (Scanner sc = new Scanner(file)) {
			for (; sc.hasNextLine();) {
				result += sc.nextLine() + System.lineSeparator();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

}
