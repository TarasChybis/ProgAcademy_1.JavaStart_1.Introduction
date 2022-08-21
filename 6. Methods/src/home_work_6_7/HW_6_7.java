//A palindrome number reads the same on both sides (right to left and left to right). The largest palindrome number obtained by multiplying two two-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome obtained by multiplying two three-digit numbers. (4 hours)

package home_work_6_7;

import java.util.Arrays;

public class HW_6_7 {

	public static void main(String[] args) {

		int y;
		int x = 0;
		int x1 = 0;
		int x2 = 0;
		for (int i = 999; i > 0; i--) {
			for (int j = 999; j > 0; j--) {
				y = i * j;
				boolean a = test(y);
				if (a && (x < y)) {
					x = y;
					x1 = i;
					x2 = j;
				}
			}
		}
		System.out.println("The largest palindrome number obtained by multiplying two three-digit numbers: " + x + " = " + x1 + " * " + x2);
	}

	public static boolean test(int n) {
		boolean x = true;
		String a = Integer.toString(n);
		char[] b = a.toCharArray();
		for (int i = 0; i < b.length; i++) {
			if (b[i] != b[b.length - 1 - i]) {
				x = false;
			}
		}
		return x;
	}
}
//	public static void main(String[] args) {
//		int w = 999 - 100 + 1;
//		int[] arr1 = new int[w];
//		for (int i = 0; i < arr1.length; i++) {
//			arr1[i] = i + 100;
//		}
//		int y, x = 0, x1 = 0, x2 = 0, a, b, c, d, e, f;
//		for (int i = 999; i > 0; i--) {
//			for (int j = 999; j > 0; j--) {
//				y = i * j;	
//				a = y / 100000;
//				b = y % 100000 / 10000;
//				c = y % 10000 / 1000;
//				d = y % 1000 / 100;
//				e = y % 100 / 10;
//				f = y % 10;
//				if (a == f && b == e && c == d) {
//					x = y;
//					x1 = i;
//					x2 = j;				
//				}
//			}
//		}
//		System.out.println("The largest palindrome number obtained by multiplying two three-digit numbers: " + x + " = " + x1 + " * " + x2);
//	}
//}
//	public static String polindrom(int[] arr1) {
//		String polindrom;
//		for (int i=arr1.length; i>=0; i--) {
//			int mult = arr1[i] * arr1[i-1];
//			int a = mult / 100000;
//			int b = mult % 100000 / 10000;
//			int c = mult % 10000 / 1000;
//			int d = mult % 1000 / 100;
//			int e = mult % 100 / 10;
//			int f = mult % 10;
//			if(a == f && b == e && c == d) {
//				polindrom = mult + " " + "=" + " " + (arr1[i] * arr1[i-1]);
//				break;		
//			}
//		} 
//		return polindrom;
//	} 
//}