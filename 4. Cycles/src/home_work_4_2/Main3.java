//Calculate by loop the factorial of the number “ n ” entered from the keyboard (4<n<16). The factorial of a number is the product of all numbers from that number to 1. For example: 5! = 5*4*3*2*1 = 120

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