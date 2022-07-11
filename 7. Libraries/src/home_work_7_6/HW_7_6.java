//Расстояние Хэмминга между двумя целыми  числами - это число  
//позиций, в которых биты различаются .
//Для примера:
//    117 = 0 1 1 1 0 1 0 1
//     17 = 0 0 0 1 0 0 0 1
//-----------------------------------
//H = 0+1+1+0+0+1+0+0 = 3 - расстояние Хэмминга между (117,17)
//Даны два положительных целых числа (N, M) в десятичном виде. Вам 
//необходимо подсчитать расстояние Хэмминга между этими двумя 
//числами.

package home_work_7_6;
import java.util.Scanner;
public class HW_7_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number N");
		int n = sc.nextInt();
		System.out.println("Input number M");
		int m = sc.nextInt();
		String convertN = Integer.toBinaryString(n);
		System.out.println("Binary Format N - " + convertN);
		String convertM = Integer.toBinaryString(m);
		System.out.println("Binary Format M - " + convertM);

		hemingNumber(n, m);

	}

	public static void hemingNumber(int n, int m) {
		int l = n ^ m;
		int heming = 0;
		for (; l > 0;) {
			if ((l & 1) == 1) {
				heming++;
			}
			l = l >> 1;
		}
		System.out.println("Heming number - " + heming);
	}
}
