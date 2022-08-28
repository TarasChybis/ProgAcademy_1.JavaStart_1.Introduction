//Create and delete files and folders.
//Find out the size of files.

package lesson_8_1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Lesson_8_1 {

	public static void main(String[] args) {
		
//		������ �������� �������� ������ ����������:
		File workFolder = new File("."); 
		
//		������� ������ �������� ������� ����:
		File file1 = new File("a.txt");
		try {                                 //�������� ������ try/catch - ����������� ����������.
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File folder1 = new File("AAAA");
	    folder1.mkdirs();
	    
//	    ������������� ��������� ������������ ������ ������ �������:
	    File file2 = new File(folder1, "b.docx");
	    try {
	    	file2.createNewFile();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
		
//	    �������� ������ � �����:
	    file1.delete();
	    file2.delete();
	    folder1.delete();	//��� ����, ��� �� ������� ����� ����� ������� ������� ��� ����� � ���� �����.
	    
	    File file = new File("hello.txt");
	    try (PrintWriter pw = new PrintWriter(file)) {
	    	 pw.println("Hello world");
	    } catch (IOException e) {
	    	 e.printStackTrace();
	    }

	    
//		������ ������ ����� � ������:
//		File[] files = workFolder.listFiles();
//		for (int i = 0; i < files.length; i++) {
//			System.out.println(files[i]);
//		}
		
//		������ ������ ����� + ������ ������ �����:
		File[] files = workFolder.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i] + "\t" + files[i].length());
		}
	}
}
