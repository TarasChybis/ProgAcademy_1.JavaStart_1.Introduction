package lesson_5_03;

public class Arrays {

	public static void main(String[] args) {
		
		// ��� C++ ������
	
		double arr1[]; // ���������� ������
		double arr2[][]; // ��������� ������
		double arr3[][][]; // ���������� ������
		double arr4[][][][]; // ������������� ������

		// ��� Java ������

		int[] arr5; // ���������� ������
		int[][] arr6; // ��������� ������
		int[][][] arr7; // ���������� ������
		int[][][][] arr8; // ������������� ������

		// �������������
		// ������� 1 (����� ����� ���������� ���������, �� �� ����� ���� ��� �����)

		int[] arr9;
		int size = 12;
		arr9 = new int[12];
		// ����
		arr9 = new int[size];
		// ���� � ���� �������
		int[] arr10 = new int[12];

		// �������������
		// ������� 2 (����� ����� ���������� ���������, � ����� ���� ��� �����)

		int[] arr11;
		arr11 = new int[] { 7, 2, 10, -1, 0 };

		// ���� � ���� �������

		int[] arr12 = new int[] { 7, 2, 10, -1, 0 };

		// ���� � ���� ������� ����������

		int[] arr13 = { 7, 2, 10, -1, 0 };

		// ��� ����, ��� �� ������� �������� �� �������
		
		int temp1 = arr13[2];
		System.out.println(temp1);
		
		// ��� ����, ��� �� ���������� �������� �� �������
		
		arr13[2] = 15;
		int temp2 = arr13[2];
		System.out.println(temp2);
		
		// ����� ������� ����� ������
		
		int s = arr13.length;
		System.out.println(s);
		
		// ������� ����� �� ����� �������
		
		for (int i = 0; i < arr13.length; i++) {
			System.out.println(arr13[i]);
		}
		
		// �������� �� ������� ������ �������� �������
		
		for (int i = 0; i < arr13.length; i++) {
			arr13[i] = arr13[i] + 1;
		}
		for (int i = 0; i < arr13.length; i++) {
			System.out.println(arr13[i]);
		}
		
		// ��� ����, ��� �� ������ ����� �������
		
		System.out.println(arr13.getClass()); // ������ �� ���� ������ ����������� ������ ��� �������� ������� �����
		
		// ���� ������ ������� �� �����, �� ������������� ����������� ����� toString
		
		System.out.println(arr13);
	}
} 
