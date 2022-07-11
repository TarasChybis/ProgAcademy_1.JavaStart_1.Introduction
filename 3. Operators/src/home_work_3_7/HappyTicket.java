package home_work_3_7;

import java.util.Scanner;

public class HappyTicket {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		int s;
		
		System.out.println("Введите четырехзначное число (Например: 1322");
		s = sc.nextInt();
		
		a = s / 1000;
		b = s % 1000 / 100;
		c = s % 100 / 10;
		d = s % 10;
		
		if(a + b == c + d) {
			System.out.println("Счастливый билет");
		} else {
			System.out.println("Обычное число");
		}
		
	}

}
