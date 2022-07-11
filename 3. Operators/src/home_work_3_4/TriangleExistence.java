package home_work_3_4;

import java.util.Scanner;

public class TriangleExistence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("Input a");
		a = sc.nextInt();
		
		System.out.println("Input b");
		b = sc.nextInt();
		
		System.out.println("Input c");
		c = sc.nextInt();
				
		if(a + b > c && a + c > b && b + c > a) {
			System.out.println("Треугольник существует");
		} else {
			System.out.println("Треугольник НЕ существует");
		}

	}

}
