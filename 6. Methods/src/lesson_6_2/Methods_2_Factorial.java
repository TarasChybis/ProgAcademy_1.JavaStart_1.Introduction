//�������� ���� ������, ������� �������� � ������ ��������� �����, ������� ���������� � �������� ���������.

package lesson_6_2;

public class Methods_2_Factorial {

	public static void main(String[] args) {
		long f = factorial(5);
	    System.out.println(f);
	}

	public static long factorial (long n) {
		long x = 1;
		for (int i = 1; i <= n; i++) {
			x = x * i;
		}
		return x;
	}		
}
