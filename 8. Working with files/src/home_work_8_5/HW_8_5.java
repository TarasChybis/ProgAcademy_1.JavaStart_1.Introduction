//Считайте из текстового файла текст на английском языке и 
//выведите статистику по частоте использования букв в тексте 
//(т. е. буква — количество использований), причем первыми 
//должны выводиться буквы используемы чаще всего.

package home_work_8_5;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class HW_8_5 {

	public static void main(String[] args) {
		File file = new File("EnglishText.txt");
		equelsWords(foundNumberOfWords(file));
	}

	public static char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
			'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public static char[] foundNumberOfWords(File file) {
		String line = "";
		try (Scanner sc = new Scanner(file)) {
			for (; sc.hasNextLine();) {
				line = sc.nextLine().toLowerCase();
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		char[] words = line.toCharArray();
		return words;
	}

	public static void equelsWords(char[] words) {
		int[] num = new int[alphabet.length];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (alphabet[i] == words[j]) {
					num[i]++;
				} else {
				}
			}
		}
		char temp;
		int temp2;
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 1; j < alphabet.length - i; j++) {
				if (num[j] < num[j - 1]) {

					temp = alphabet[j];
					alphabet[j] = alphabet[j - 1];
					alphabet[j - 1] = temp;

					temp2 = num[j];
					num[j] = num[j - 1];
					num[j - 1] = temp2;
				}
			}
		}
		for (int i = alphabet.length - 1; i > 0; i--) {
			System.out.println(alphabet[i] + " " + num[i]);
		}
	}
}
