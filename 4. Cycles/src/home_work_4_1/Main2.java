package home_work_4_1;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;

		System.out.println("Input a");
		a = sc.nextInt();

		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= a; i++) {
				if (i % 2 != 0) {
					System.out.print("***");
				} else {
					System.out.print("+++");
				}
			}
			System.out.println();
		}

	}

}
