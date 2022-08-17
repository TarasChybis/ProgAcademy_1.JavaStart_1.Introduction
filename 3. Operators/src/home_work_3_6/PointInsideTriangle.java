//A triangle is given with the coordinates of the vertices A(0,0), B(4,4), C(6,1). The user enters x and y coordinates from the keyboard. Write a program that will determine whether this point lies inside the triangle or not.

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
			System.out.println("The point lies inside the triangle");
		} else if((xA - xO) * (yB - yA) - (xB - xA) * (yA - yO) < 0 && (xB - xO) * (yC - yB) - (xC - xB) * (yB - yO) < 0 && (xC - xO) * (yA - yC) - (xA - xC) * (yC - yO) < 0) {
			System.out.println("The point lies inside the triangle");
		} else if((xA - xO) * (yB - yA) - (xB - xA) * (yA - yO) == 0 && (xB - xO) * (yC - yB) - (xC - xB) * (yB - yO) == 0 && (xC - xO) * (yA - yC) - (xA - xC) * (yC - yO) == 0) {
			System.out.println("The point lies on the side of the triangle");	
		} else {
			System.out.println("The point lies outside the triangle");
		}						
	}
}