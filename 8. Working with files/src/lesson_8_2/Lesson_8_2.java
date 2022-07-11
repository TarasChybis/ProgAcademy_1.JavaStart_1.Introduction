//Записать данные в файл

package lesson_8_2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Lesson_8_2 {

	public static void main(String[] args) {
		
		File file = new File("hello.txt");
		
		try (PrintWriter pw = new PrintWriter(file)) {
		
			pw.println("Hello world");
			      
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
