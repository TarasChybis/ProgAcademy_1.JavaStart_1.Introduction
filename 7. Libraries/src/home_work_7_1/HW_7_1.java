//Написать  программу  которая  вернет  количество  миллисекунд прошедших  от  такого  же  числа,  но  в  прошлом  месяце  до  сегодняшней даты. Например если сегодня 3 августа, то узнать сколько миллисекунд прошло с 3 июля.

package home_work_7_1;

import java.util.Calendar;

public class HW_7_1 {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		long todayMillis = calendar.getTimeInMillis();
		calendar.add(Calendar.MONTH, -1);
		long previousMonthMillis = calendar.getTimeInMillis();
		
		System.out.println(todayMillis-previousMonthMillis);
	}
}
