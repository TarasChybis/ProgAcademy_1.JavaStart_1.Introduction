package home_work_4_2;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		System.out.println("Input n");
		n = sc.nextInt();

		if (n > 4 && n < 16) {

			int n1 = 1;

			for (int i = 1; i <= n; i++) {
				n1 = n1 * i;
			}
			System.out.println(n1);
		} else {
			System.out.println("Error");
		}

	}

}
