//Выведите на экран 10 строк со значением числа Пи. Причем в первой 
//строке должно быть 2 знака после запятой, во второй 3, в третьей 4 и т.д.

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
