//�������� �� ����� 10 ����� �� ��������� ����� ��. ������ � ������ 
//������ ������ ���� 2 ����� ����� �������, �� ������ 3, � ������� 4 � �.�.

package home_work_7_4;

import java.util.Formatter;

public class HW_7_4 {

	public static void main(String[] args) {
		
		for (int i = 2; i < 12; i++) {
			Formatter form = new Formatter();
			form.format("%." + i + "f", Math.PI);
			String text = form.toString();
			System.out.println(text);
		}

	}

}
