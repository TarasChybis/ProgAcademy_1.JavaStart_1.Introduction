//Create a console "text editor" with the ability saving the typed text to a file.

package home_work_8_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class HW_8_1_2 {

	public static void main(String[] args) {
		File file = new File("saveText.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			StringBuilder sb = new StringBuilder();
			System.out.println("Input text and print 'end' for finish");
			String text = "";
			do {
				text = br.readLine();
				sb.append(text);
				sb.append(System.lineSeparator());
			} while (!text.equals("end"));
			saveTxt(sb, file);
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("The text is saved");
	}

	public static void saveTxt(StringBuilder sb, File file) {
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.print(sb);
		} catch (FileNotFoundException e) {
			System.out.println("write error ");
		}
	}
}