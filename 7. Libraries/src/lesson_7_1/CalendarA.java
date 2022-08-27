package lesson_7_1;

import java.util.Date;
import java.util.Calendar;

public class CalendarA {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
//		Set desired date:
//		calendar.set(1981, Calendar.OCTOBER, 11);
		
//		Set desired month:
//		calendar.set(Calendar.MONTH, 0);
		
//		Add the desired number of days:
//		calendar.add(Calendar.DAY_OF_MONTH, 17);
		
//		Return the number of milliseconds from 01.01.1970:
		System.out.println(calendar.getTimeInMillis());
		
//		Get the day of the month:
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
			
//		The current date:
		Date date = calendar.getTime();
		System.out.println(date);
	}
}