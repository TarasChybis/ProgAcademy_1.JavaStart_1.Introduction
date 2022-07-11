//����������  ������  {1,2,3,4,5}  �  ������  �������  �����  ���� 
//������������.  ��������  ���������  �������  �������  ��  �����  ��� ���������  ����������  ��  ����  ����.  
//��������  ����������  ���� �� ������.(2 ����)

package narayana_test;

import java.util.Arrays;
import java.util.Scanner;

public class NarayanaTest {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the length of the array and press Enter: ");
        int size = sc.nextInt();
        while (size <= 1) {
            System.out.println("Invalid input! Try again.");
            size = sc.nextInt();
        }
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        changeArray(numbers, numbers.length);
    }

    static void changeArray(int[] array, int index) {
        int element;
        if (index <= 0) {
            System.out.println(Arrays.toString(array));
        } else {
            for (int j = 0; j < index; j++) {
                for (int i = 0; i < index; i++) {
                    element = array[i];
                    array[i] = array[index - 1];
                    array[index - 1] = element;
                }
                changeArray(array, index - 1);
            }
        }
    }
}
//	// �������� ���������
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int count = scanner.nextInt();
//		Integer[] sequence = new Integer[count];
//		initSequence(sequence); // ������������ �������� ������������������
//		System.out.println("����������� ������������������ � � ������������:");
//		do {
//			System.out.println(Arrays.deepToString(sequence));
//		} while (Narayana.nextPermutation(sequence, NarayanaTest::less));
//		// x < y � �������� ��������� ��� ����������� ������������������
//		System.out.println("�������������� ������������������ � � ������������:");
//		do {
//			System.out.println(Arrays.deepToString(sequence));
//		} while (Narayana.nextPermutation(sequence, NarayanaTest::greater));
//		// x > y � �������� ��������� ��� �������������� ������������������
//	}
//	// ���������� true, ���� value_0 ������ value_1, ����� � false
//	static final <T extends Comparable> boolean less(final T value_0, final T value_1) {
//		return value_0.compareTo(value_1) < 0;
//	}
//
//	// ���������� true, ���� value_0 ������ value_1, ����� � false
//	static final <T extends Comparable> boolean greater(final T value_0, final T value_1) {
//		return value_0.compareTo(value_1) > 0;
//	}
//
//	// ������������� ������������������
//	static final void initSequence(Integer[] sequence) {
//		// ���������� ������������������ ���������� 1, 2, 3�
//		for (int value = sequence.length; value > 0; --value)
//			sequence[value - 1] = value;
//	}
//}
