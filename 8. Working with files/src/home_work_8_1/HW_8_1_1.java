//Создайте консольный «текстовый редактор» с возможностью сохранения набранного текста в файл.

package home_work_8_1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HW_8_1_1 {

	public static void main(String[] args) {
		File file1 = new File("file1.txt");
		System.out.println("Введите текст:");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		try (PrintWriter operate = new PrintWriter(file1)) {
			operate.println(text);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Спасибо, Ваш текст был сохранён!");
	}		
}
