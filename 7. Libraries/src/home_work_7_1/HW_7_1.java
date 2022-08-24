//Write a program to return the number of milliseconds passed from the same date, but last month to today's date. For example, if today is August 3rd, then find out how many milliseconds have passed since July 3rd.

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