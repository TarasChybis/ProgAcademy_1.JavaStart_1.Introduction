//Create and delete files and folders.
//Find out the size of files.

package lesson_8_1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Lesson_8_1 {

	public static void main(String[] args) {
		
//		Address of the working directory of our application:
		File workFolder = new File("."); 
		
//		Create the object of the file system FILE:
		File file1 = new File("a.txt");
		try {                                 //surround with block try/catch - CHECKED EXCEPTION.
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File folder1 = new File("AAAA");
	    folder1.mkdirs();
	    
//	    Relative addressing relative to any other address:
	    File file2 = new File(folder1, "b.docx");
	    try {
	    	file2.createNewFile();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
		
//	    Deleting files and folders:
//	    file1.delete();
	    file2.delete();
	    folder1.delete();	//In order to delete a FOLDER, you must first delete ALL FILES in that folder.
	    
	    File file = new File("hello.txt");
	    try (PrintWriter pw = new PrintWriter(file)) {
	    	 pw.println("Hello world");
	    } catch (IOException e) {
	    	 e.printStackTrace();
	    }

	    
//		Find out a list of folders and files:
//		File[] files = workFolder.listFiles();
//		for (int i = 0; i < files.length; i++) {
//			System.out.println(files[i]);
//		}
		
//		Find out the list of folders + size of each folder:
		File[] files = workFolder.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i] + "\t" + files[i].length());
		}
	}
}