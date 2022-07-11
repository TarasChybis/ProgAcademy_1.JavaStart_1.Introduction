package home_work_3_6;

import java.util.Scanner;

public class PointInsideTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double xA = 0;
		double yA = 0;
		double xB = 4;
		double yB = 4;
		double xC = 6;
		double yC = 1;
		double xO;
		double yO;
		
		System.out.println("Input x");
		xO = sc.nextDouble();
		
		System.out.println("Input y");
		yO = sc.nextDouble();
		
		if((xA - xO) * (yB - yA) - (xB - xA) * (yA - yO) > 0 && (xB - xO) * (yC - yB) - (xC - xB) * (yB - yO) > 0 && (xC - xO) * (yA - yC) - (xA - xC) * (yC - yO) > 0) {
			System.out.println("Точка лежит внутри треугольника");
		} else if((xA - xO) * (yB - yA) - (xB - xA) * (yA - yO) < 0 && (xB - xO) * (yC - yB) - (xC - xB) * (yB - yO) < 0 && (xC - xO) * (yA - yC) - (xA - xC) * (yC - yO) < 0) {
			System.out.println("Точка лежит внутри треугольника");
		} else if((xA - xO) * (yB - yA) - (xB - xA) * (yA - yO) == 0 && (xB - xO) * (yC - yB) - (xC - xB) * (yB - yO) == 0 && (xC - xO) * (yA - yC) - (xA - xC) * (yC - yO) == 0) {
			System.out.println("Точка лежит на стороне треугольника");	
		} else {
			System.out.println("Точка лежит вне треугольника");
		}
						
	}

}
