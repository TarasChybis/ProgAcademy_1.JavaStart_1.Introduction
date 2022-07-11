//Напишите метод который вернет количество слов в строке текста.

package home_work_6_5;

import java.util.Scanner;

public class HW_6_5 {
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Input text");
		String text = sc.nextLine();
		if (text.length() == 0) {
			System.out.println("Amount words: " + 0);
		} else {
			System.out.println("Amount words: " + amountWords(text));
		}
		
	}

	public static int amountWords(String text) {
		String[] words = text.split(" +");
		return words.length;
	}
}
	
	
//	public static void main(String[] args) {	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input text");
//		String text = sc.nextLine();
//		if (text.length() == 0) {
//			System.out.println("Amount words: " + 0);
//		} else {
//			System.out.println("Amount words: " + amountWords(text));
//		}
//		
//	}
//
//	public static int amountWords(String text) {
//		String[] words = text.split("\\s+");
//		return words.length;
//	}
//}

//	public static void main(String[] args) {
//		String str = "I love Java";
//		String[] words = str.split(" ");
//		for (String word : words) {
//			System.out.println(word);
//		}
//	}
//}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input text");
//		String text = sc.nextLine();
//		
//		System.out.println("Amount words: " + amountWords(text));
//		
//	}
//
//	public static int amountWords(String text) {
//		char[] words = text.toCharArray();
//		int sum = 1;
//		char space = ' ';
//		for (int i = 0; i < words.length; i++) {
//			if (words[i] == space) {
//				sum = sum + 1;
//			}
//		}
//		return sum;
//	}
//}
