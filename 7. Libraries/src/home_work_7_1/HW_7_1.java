//��������  ���������  �������  ������  ����������  ����������� ���������  ��  ������  ��  �����,  ��  �  �������  ������  ��  ����������� ����. �������� ���� ������� 3 �������, �� ������ ������� ����������� ������ � 3 ����.

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
