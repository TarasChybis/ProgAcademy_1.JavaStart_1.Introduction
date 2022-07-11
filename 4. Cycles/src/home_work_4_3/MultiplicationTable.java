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

//Вариант 2
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

