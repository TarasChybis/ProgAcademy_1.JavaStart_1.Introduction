package lesson_7_1;

import java.util.Date;
import java.util.Calendar;

public class CalendarA {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
//		���������� ������ ����:
//		calendar.set(1981, Calendar.OCTOBER, 11);
		
//		���������� ������ �����:
//		calendar.set(Calendar.MONTH, 0);
		
//		�������� ������ ���������� ����:
//		calendar.add(Calendar.DAY_OF_MONTH, 17);
		
//		������� ���������� ����������� �� 01.01.1970:
		System.out.println(calendar.getTimeInMillis());
		
//		������� ����� ���� ������:
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
			
//		������� ����:
		Date date = calendar.getTime();
		System.out.println(date);

	}

}
