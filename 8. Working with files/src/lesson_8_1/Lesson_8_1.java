package lesson_8_1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Lesson_8_1 {

	public static void main(String[] args) {
		
//		Адресс рабочего каталога нашего приложения:
		File workFolder = new File("."); 
		
//		Создать объект файловой системы ФАЙЛ:
		File file1 = new File("a.txt");
		try {                                 //окружить блоком try/catch - ПРОВЕРЯЕМОЕ ИСКЛЮЧЕНИЕ.
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File folder1 = new File("AAAA");
	    folder1.mkdirs();
	    
//	    Относительная адресация относительно любого другог адресса:
	    File file2 = new File(folder1, "b.docx");
	    try {
	    	file2.createNewFile();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
		
//	    Удаление файлов и папок:
	    file1.delete();
	    file2.delete();
	    folder1.delete();	//для того, что бы удалить ПАПКУ нужно сначала удалить ВСЕ ФАЙЛЫ в этой папке.
	    
	    File file = new File("hello.txt");
	    try (PrintWriter pw = new PrintWriter(file)) {
	    	 pw.println("Hello world");
	    } catch (IOException e) {
	    	 e.printStackTrace();
	    }

	    
//		Узнать список папок и файлов:
//		File[] files = workFolder.listFiles();
//		for (int i = 0; i < files.length; i++) {
//			System.out.println(files[i]);
//		}
		
//		Узнать список папок + размер каждой папки:
		File[] files = workFolder.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i] + "\t" + files[i].length());
		}
	}
}
