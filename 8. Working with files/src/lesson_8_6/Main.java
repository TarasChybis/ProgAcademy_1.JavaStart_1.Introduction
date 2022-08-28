package lesson_8_6;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//The address of our application's working directory:
//		File workFolder = new File(".");
//	    
//	    File[] files = workFolder.listFiles();
//	    for (int i = 0; i < files.length; i++) {
//	      System.out.println(files[i]);
//	    }
//	    
//	    File workFolder = new File(".");
//
//	    File file1 = new File("a.txt");
//	    
//	    try {
//	      file1.createNewFile();
//	    } catch (IOException e) {
//	      // TODO Auto-generated catch block
//	      e.printStackTrace();
//	    }
//
//	    File folder1 = new File("AAAA");
//	    folder1.mkdirs();
//
//	    File file2 = new File(folder1, "b.docx");
//
//	    try {
//	      file2.createNewFile();
//	    } catch (IOException e) {
//	      e.printStackTrace();
//	    }
		
//Deleting files and folders:
//	    file1.delete();
//	    file2.delete();
//	    folder1.delete();
//	    
//	    File[] files = workFolder.listFiles();
//	    for (int i = 0; i < files.length; i++) {
//	      System.out.println(files[i] + "\t" + files[i].length());
//	    }

//Write data to file:
//	    File file = new File("hello.txt");
//
//	    try (PrintWriter pw = new PrintWriter(file)) {
//
//	      pw.println("Hello world");
//	      
//	    } catch (IOException e) {
//	      e.printStackTrace();
//	    }

//Save one-dimensional array data to a file:
//		File file = new File("a.txt");
//	    int[] array = new int[] { 1, 5, 7, -2 };
//	    
//	    saveArrayToFile(file, array);
//	}
//	
//	  public static void saveArrayToFile(File file, int[] array) {
//	    try (PrintWriter pw = new PrintWriter(file)) {
//	      for (int i = 0; i < array.length; i++) {
//	        pw.println(array[i]);
//	      }
//	    } catch (IOException e) {
//	    	e.printStackTrace();
//	    }	  
//	}
//}

//Read record from file:		
//		File file = new File("a.txt");
//		
//		String result = loadStringFromFile(file);
//
//	    System.out.println(result);
//	    
//	}
//
//	  public static String loadStringFromFile(File file) {
//	    String result = "";
//
//	    try (Scanner sc = new Scanner(file)) {
//
//	      for (; sc.hasNextLine();) {
//	        result += sc.nextLine() + System.lineSeparator();
//	      }
//
//	    } catch (IOException e) {
//	      e.printStackTrace();
//	    }
//	    return result;
//	  }
//

//Save one-dimensional array data to a file:
//	  public static void saveArrayToFile(File file, int[] array) {
//	    try (PrintWriter pw = new PrintWriter(file)) {
//	      for (int i = 0; i < array.length; i++) {
//	        pw.println(array[i]);
//	      }
//	    } catch (IOException e) {
//	    	e.printStackTrace();
//	    }
	  }
}