//Display 10 lines with the value of pi. Moreover, the first line should have 2 decimal places, the second 3, the third 4, etc.

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