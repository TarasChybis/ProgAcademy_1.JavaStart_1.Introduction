//Display the largest number of numbers in a file.

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

//Convert string to number:
//Parsing - when we get a number from the text.
//		int z = Integer.parseInt("120");
//		System.out.println(z);
	}

	public static int getMaxNumberFromString(String text) {
//		1.Return an array based on the elements of a given file
//		If you need to split a string into parts, there is a split method
//		As By which symbol to break we use the Line feed character System.lineSeparator()
//		Create an array:
		String[] textNumbers = text.split(System.lineSeparator());
//		We assume that the largest number is what is stored on the zero element
//		From string to number - Integer.parseInt()
		int max = Integer.parseInt(textNumbers[0]);
//		Go through all the other elements
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