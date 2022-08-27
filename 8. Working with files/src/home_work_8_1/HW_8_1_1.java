//Create a console "text editor" with the ability saving the typed text to a file.

package home_work_8_1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HW_8_1_1 {

	public static void main(String[] args) {
		File file1 = new File("file1.txt");
		System.out.println("Enter text:");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		try (PrintWriter operate = new PrintWriter(file1)) {
			operate.println(text);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Thank you, your text has been saved!");
	}		
}