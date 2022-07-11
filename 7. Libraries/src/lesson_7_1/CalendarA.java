package lesson_7_1;

import java.util.Date;
import java.util.Calendar;

public class CalendarA {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
//		Установить нужную дату:
//		calendar.set(1981, Calendar.OCTOBER, 11);
		
//		Установить нужный месяц:
//		calendar.set(Calendar.MONTH, 0);
		
//		Добавить нужное количество дней:
//		calendar.add(Calendar.DAY_OF_MONTH, 17);
		
//		Вывести количество миллисекунд от 01.01.1970:
		System.out.println(calendar.getTimeInMillis());
		
//		Вывести какой день месяца:
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
			
//		Вывести дату:
		Date date = calendar.getTime();
		System.out.println(date);

	}

}
