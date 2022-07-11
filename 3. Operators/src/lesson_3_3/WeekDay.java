package lesson_3_3;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int day;

		System.out.println("Input day from 1 to 7");
		day = sc.nextInt();
		
		// Вариант if - else if - else
		
		if(day==1) {
			System.out.println("Понедельник");
		} else if(day==2) {
			System.out.println("Вторник");
		} else if(day==3) {
			System.out.println("Среда");
		} else if(day==4) {
			System.out.println("Четверг");
		} else if(day==5) {
			System.out.println("Пятница");
		} else if(day==6) {
			System.out.println("Суббота");
		} else if(day==7) {
			System.out.println("Воскресенье");
		} else {
			System.out.println("Ошибка ввода");
		}
		
		//Вариант switch-case-break-default
		
		switch(day) {
		case 1: 
			System.out.println("Понедельник");
			break;
		case 2:
			System.out.println("Вторник");
			break;
		case 3: 
			System.out.println("Среда");
			break;
		case 4: 
			System.out.println("Четверг");
			break;
		case 5: 
			System.out.println("Пятница");
			break;
		case 6: 
			System.out.println("Суббота");
			break;
		case 7: 
			System.out.println("Воскресенье");
			break;
		default:
			System.out.println("Ошибка ввода");
		}
			
	}

}
