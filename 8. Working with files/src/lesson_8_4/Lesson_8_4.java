//—читать запись с файла:

package lesson_8_4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lesson_8_4 {

	public static void main(String[] args) {
		
		File file = new File("a.txt");
		
		String result = loadStringFromFile(file);

	    System.out.println(result);
	    
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
