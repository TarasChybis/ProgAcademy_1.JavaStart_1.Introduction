//¬ведите  строку  текста  с  клавиатуры  Ч  реализуйте  программу  дл€ 
//возможности подсчета количества символа Ч 'b' в этой строке, с выводом 
//результат на экран.

package home_work_5_4;

import java.util.Scanner;
import java.util.Arrays;

public class AmountOfSymbols {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input string");

		String a = sc.nextLine();
		char[] t = a.toCharArray();

		System.out.println(Arrays.toString(t));

		int b = 0;

		for (int i = 0; i < t.length; i++) {
			if ((t[i] == 'b') || (t[i] == 'B')) {
				b = b + 1;
			}
		}
		System.out.println("b = " + b);
	}

}