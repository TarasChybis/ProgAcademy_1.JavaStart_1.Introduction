//Save data of one-dimensional array to a file

package lesson_8_3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Lesson_8_3 {

	public static void main(String[] args) {
		
		File file = new File("a.txt");
	    int[] array = new int[] { 1, 5, 7, -2 };
	    
	    saveArrayToFile(file, array);
	}
	
	public static void saveArrayToFile(File file, int[] array) {
	    try (PrintWriter pw = new PrintWriter(file)) {
	    	for (int i = 0; i < array.length; i++) {
	    		pw.println(array[i]);
	    	}
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }	  
	}
}