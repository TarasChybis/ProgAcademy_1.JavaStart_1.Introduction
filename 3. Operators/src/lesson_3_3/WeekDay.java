package lesson_3_3;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int day;

		System.out.println("Input day from 1 to 7");
		day = sc.nextInt();
		
		// ������� if - else if - else
		
		if(day==1) {
			System.out.println("�����������");
		} else if(day==2) {
			System.out.println("�������");
		} else if(day==3) {
			System.out.println("�����");
		} else if(day==4) {
			System.out.println("�������");
		} else if(day==5) {
			System.out.println("�������");
		} else if(day==6) {
			System.out.println("�������");
		} else if(day==7) {
			System.out.println("�����������");
		} else {
			System.out.println("������ �����");
		}
		
		//������� switch-case-break-default
		
		switch(day) {
		case 1: 
			System.out.println("�����������");
			break;
		case 2:
			System.out.println("�������");
			break;
		case 3: 
			System.out.println("�����");
			break;
		case 4: 
			System.out.println("�������");
			break;
		case 5: 
			System.out.println("�������");
			break;
		case 6: 
			System.out.println("�������");
			break;
		case 7: 
			System.out.println("�����������");
			break;
		default:
			System.out.println("������ �����");
		}
			
	}

}
