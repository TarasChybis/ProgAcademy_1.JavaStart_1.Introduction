package lesson_5_04;

import java.util.Arrays;

public class ArraysAdditionally {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 7, 2, 10, -1, 0 };

//		�������������� ������� ��� ������ � ���������
		

//		�������������� - ������� ������ ������� �� �����
//		Arrays.toString(����� ������ �������������);
		System.out.println("arr1 " + Arrays.toString(arr1));
				
		
//		�����������
//		Arrays.copyOfRange(����� ������ ����������, ��������� ������, �������� ������);
		int[] arr2 = new int[3];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i + 1];
		}
		System.out.println("arr2 " + Arrays.toString(arr2));
//		����
		int[] arr3 = Arrays.copyOfRange(arr1, 1, 4); // [s, f)
		System.out.println("arr3 " + Arrays.toString(arr3));

		
//		����������� � ���������� �������
//		Arrays.copyOf(����� ������ ����������, ����� ������);
		int[] arr4 = Arrays.copyOf(arr1, 12);
		System.out.println("arr4 " + Arrays.toString(arr4));
		
		
//		����������
//		Arrays.sort(����� ������ ���������);
//		Arrays.sort(����� ������ ���������, ��������� ������, �������� ������);
		Arrays.sort(arr3);
		System.out.println("arr3 " + Arrays.toString(arr3));
		
		
//		����������
//		Arrays.fill(����� ������ �����������, ��� �����������);
		Arrays.fill(arr1, 7);
		System.out.print("arr1 " + Arrays.toString(arr1));
		
	}
}
