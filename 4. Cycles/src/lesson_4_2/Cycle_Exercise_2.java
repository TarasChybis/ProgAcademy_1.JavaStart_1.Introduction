//������: ������� � ���������� 2 ���������� ���� int (a, b). ���� b>a, �� ��������� ����� ����� �����
//�� a �� b ������������.
//a = 2, b = 5 => sum = 2 + 3 + 4 + 5 = 14
//���� a <= b, �� ������� ������� ������ �����.

package lesson_4_2;

import java.util.Scanner;

public class Cycle_Exercise_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int sum;

		System.out.println("Input a");
		a = sc.nextInt();

		System.out.println("Input b");
		b = sc.nextInt();

		if (b > a) {
			sum = 0;
			for (int i = a; i <= b; i++) {
				sum = sum + i;
			}
			System.out.println("Sum = " + sum);
		} else {
			System.out.println("������ �����");
		}
	}
}
