//¬вести  с  консоли  число  в  бинарном  формате. ѕеревести  его  в 
//дес€тичный  и вывести на экран (У10Ф -> 2).

package home_work_7_3;

import java.util.Scanner;

public class HW_7_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input binary number: ");
		String bin = sc.nextLine();
		
		int binNum = Integer.parseInt(bin, 2);

		System.out.println(binNum);

	}

}
