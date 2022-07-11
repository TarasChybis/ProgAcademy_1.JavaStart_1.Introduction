//С клавиатуры считать челое число int w;
//Вывести на экран в строке столько * чему равно значение этой переменной.
//Например w=5
//
//*****
//Для вывода на экран без пеевода строки используйте System.out.print();

package lesson_4_3;

import java.util.Scanner;

public class Cycle_Exercise_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int w;
		
		System.out.println("Input w");
		w = sc.nextInt();
		
		for(int i = 1; i <= w; i++) {
			System.out.println("*");
		}
		
	}

}
