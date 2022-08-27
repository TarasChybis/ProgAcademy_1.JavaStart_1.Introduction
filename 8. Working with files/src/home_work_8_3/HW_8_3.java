//Implement a method that will display a list of all directories that "lie" in the directory that will be the parameter of this method.

package home_work_8_3;

import java.io.File;

public class HW_8_3 {

	public static void main(String[] args) {
//		File folder = new File("Files");
//		folder.mkdirs();
//
//		area(folder);
//	}
//
//	public static void area(File folder) {
//
//		File[] files = folder.listFiles();
//		for (int i = 0; i < files.length; i++) {
//			if (files[i].isDirectory()) {
//
//				System.out.println(files[i]);
//			}
//		}
//	}
	
		File folder = new File(".");
		folder.mkdirs();
		foundFolder(folder);
	}
	
	public static void foundFolder(File folder) {
		File[] files = folder.listFiles();
		for (int i = 0; i < files.length; i++) 
			if (files[i].isDirectory()) {
			System.out.println(files[i] +  " - Folder" );
		}
	}
}	