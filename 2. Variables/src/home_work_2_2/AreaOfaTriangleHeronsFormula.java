package home_work_2_2;

import java.util.Scanner;

public class AreaOfaTriangleHeronsFormula {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("������� ����� ������� A ������������ ABC (��):");
		double a = sc.nextDouble();
		System.out.println("������� ����� ������� B ������������ ABC (��):");
		double b = sc.nextDouble();
		System.out.println("������� ����� ������� C ������������ ABC (��):");
		double c = sc.nextDouble();
		double area;
		double p;

		p = (a + b + c) / 2;

		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println("������� ������������ " + area + " ��2");

	}

}
