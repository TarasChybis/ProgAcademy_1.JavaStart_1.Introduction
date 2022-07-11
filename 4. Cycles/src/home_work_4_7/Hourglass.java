package home_work_4_7;
import java.util.Scanner;
public class Hourglass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.println("¬ведите нечетное число");
		a = sc.nextInt();

		for (int j = 0; j <= a; j++) {
			
			if (j == a / 2) continue;
			
			for (int i = 0; i <= a; i++) {
				
				if (j < a - j) {
					if (i >= j && i < a - j) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					
				} else if ((i >= a - j) && (i < j)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
