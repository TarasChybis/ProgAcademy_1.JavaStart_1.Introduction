//There is a circle with a center at the origin and a radius of 4. The user enters the x and y coordinates of the point from the keyboard. Write a program that will determine whether this point lies inside the circle or not.

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
			System.out.println("The point lies inside the circle");
		}
		if(Math.pow(x,2) + Math.pow(y,2) > Math.pow(r,2)) {
			System.out.println("The point lies outside the circle");
		}
		if(Math.pow(x,2) + Math.pow(y,2) == Math.pow(r,2)) {
			System.out.println("The point lies on the circle");
		}
	}
}