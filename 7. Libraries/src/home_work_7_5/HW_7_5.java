//¬вести с консоли дату. —равнить ее с текущей датой в системе. ¬ывести отличающиес€ части (год, мес€ц) на экран.

package home_work_7_5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HW_7_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date dateConsol = new Date();
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd:MM:yyyy");
		System.out.println("Input Date in format dd:MM:yyyy");
		String dateTextConsol = sc.nextLine();
		try {
			dateConsol = sdf2.parse(dateTextConsol);
		} catch (ParseException e) {
			System.out.println(e + " is not correct");
		}
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd:MM:yyyy");
		String dateText = sdf3.format(dateConsol);
		System.out.println("Consol  date is " + dateText);

		Date dateCurrent = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd:MM:yyyy");
		String textDateCurrent = sdf1.format(dateCurrent);
		System.out.println("Current date is " + textDateCurrent);

		differenceOfDate(dayDate(dateText), dayDate(textDateCurrent));
		differenceOfDate(monthDate(dateText), monthDate(textDateCurrent));
		differenceOfDate(yearDate(dateText), yearDate(textDateCurrent));
	}

	public static void differenceOfDate(String date1, String date2) {
		if (date1.equals(date2)) {
		} else {
			System.out.println("Difference: " + date1 + " " + date2);
		}
	}

	public static String dayDate(String date) {
		StringBuilder sb = new StringBuilder(date);
		sb.delete(2, sb.length());
		String text = sb.toString();
		return text;
	}

	public static String monthDate(String date) {
		StringBuilder sb = new StringBuilder(date);
		sb.delete(0, 3);
		sb.delete(2, sb.length());
		String text = sb.toString();
		return text;
	}

	public static String yearDate(String date) {
		StringBuilder sb = new StringBuilder(date);
		sb.delete(0, 6);
		String text = sb.toString();
		return text;
	}
}
