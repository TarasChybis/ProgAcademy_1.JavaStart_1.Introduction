package home_work_3_5;

import java.util.Scanner;

public class PointInsideCircle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int r = 4;
		int x;
		int y;
		
		System.out.println("Ipmut x");
		x = sc.nextInt();
		
		System.out.println("Ipmut y");
		y = sc.nextInt();
		
		if(Math.pow(x,2) + Math.pow(y,2) < Math.pow(r,2)) {
			System.out.println("Точка лежит внутри круга");
		}
		if(Math.pow(x,2) + Math.pow(y,2) > Math.pow(r,2)) {
			System.out.println("Точка лежит вне круга");
		}
		if(Math.pow(x,2) + Math.pow(y,2) == Math.pow(r,2)) {
			System.out.println("Точка лежит на окружности");
		}

	}

}
