//The current date:
//package lesson_7_2;
//import java.util.Date;
//public class DateA {
//	public static void main(String[] args) {
//		Date date = new Date();
//		System.out.println(date);
//	}
//}

//The date we want to set:
//package lesson_7_2;
//import java.util.Date;
//public class DateA {
//	public static void main(String[] args) {
//		long t = 1234567891011L;    
//		Date date = new Date(t);
//		System.out.println(date);
//	}
//}

//The text (the characters that contain only letters): ALL in double quotes, and text in single quotes.
//package lesson_7_2;
//import java.util.Date;
//import java.text.SimpleDateFormat;
//public class DateA {
//	public static void main(String[] args) {
//		Date date = new Date();
//		SimpleDateFormat sdf1 = new SimpleDateFormat("'Hello Word'");
//		String text = sdf1.format(date);
//		System.out.println(text);
//	}
//}

//Text + symbols: ALL in double quotes, and text in single quotes.
//package lesson_7_2;
//import java.util.Date;
//import java.text.SimpleDateFormat;
//public class DateA {
//	public static void main(String[] args) {
//		Date date = new Date();
//		SimpleDateFormat sdf1 = new SimpleDateFormat("'Hello Word' :-)");
//		String text = sdf1.format(date);
//		System.out.println(text);
//	}
//}

//Text + FORMAT SPECIFIERS: ALL in double quotes, but text in single quotes.
//package lesson_7_2;
//import java.util.Date;
//import java.text.SimpleDateFormat;
//public class DateA {
//	public static void main(String[] args) {
//		Date date = new Date();
//		SimpleDateFormat sdf1 = new SimpleDateFormat("'Hello Word' G");
//		String text = sdf1.format(date);
//		System.out.println(text);
//	}
//}

//FORMAT SPECIFIERS: ALL in double quotes.
//package lesson_7_2;
//import java.util.Date;
//import java.text.SimpleDateFormat;
//public class DateA {
//	public static void main(String[] args) {
//		Date date = new Date();
//		SimpleDateFormat sdf1 = new SimpleDateFormat("dd MMMM yyyy");
//		SimpleDateFormat sdf2 = new SimpleDateFormat("dd:MM:yy");
//		String text = sdf1.format(date);
//		System.out.println(text);
//		text = sdf2.format(date);
//		System.out.println(text);
//	}
//}

//Convert String to Date:
package lesson_7_2;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class DateA {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd:MM:yy");
		String day = "11:10:1981";
		// EXCEPTION HANDLER try/catch
		try {
			date = sdf2.parse(day);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date);
	}
}