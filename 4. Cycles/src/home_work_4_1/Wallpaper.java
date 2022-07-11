package home_work_4_1;

import java.util.Scanner;

public class Wallpaper {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h;

		System.out.println("Input h");
		h = sc.nextInt();

		for(int j = 1; j <= 5; j++) {
			
			for (int i = 1; i <= h; i++) {
				if(i % 2 == 1) {
					System.out.print("***");
				}
				if(i % 2 == 0) {
					System.out.print("+++");
				}
			}
			System.out.println();
		}
	}
}
