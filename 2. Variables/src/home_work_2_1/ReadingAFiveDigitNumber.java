package home_work_2_1;

import java.util.Scanner;

public class ReadingAFiveDigitNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ââåäèòå ëþáîå ÷èñëî (íàïðèìåð: 54698):");
		int number = sc.nextInt();

		int digit1 = number / 10000;
		int digit2 = number % 10000 / 1000;
		int digit3 = number % 1000 / 100;
		int digit4 = number % 100 / 10;
		int digit5 = number % 10;

		System.out.println("×èñëî 1 - " + digit1);
		System.out.println("×èñëî 2 - " + digit2);
		System.out.println("×èñëî 3 - " + digit3);
		System.out.println("×èñëî 4 - " + digit4);
		System.out.println("×èñëî 5 - " + digit5);

	}

}

1) Написать программу которая считывает 5-и значное число с 
клавиатуры и выводит цифры из которого оно состоит. 
Например : Считывается число 54698
Выводиться:	5
		4
		6
		9
		8
