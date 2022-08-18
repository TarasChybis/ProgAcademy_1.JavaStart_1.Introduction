//Print the times table for 5. It is preferable to print 1 x 5 = 5, 2 x 5 = 10, not just 5, 10, etc.

//Option 1
package home_work_4_3;

public class MultiplicationTable {

	public static void main(String[] args) {

		int n = 5;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " x " + n + " = " + i * n);
			System.out.println();
		}
	}
}

//Option 2
//package chybis;
//
//public class MultiplicationTable {
//
//	public static void main(String[] args) {
//
//		int n = 5;
//		
//		for (int i = 1; i <= 10; i++) {
//			
//			if(i * n > 0) {
//				System.out.print(i + " x 5 = " + i * n);
//			}
//			System.out.println();
//		}
//	}
//}