//Существует  массив  {1,2,3,4,5}  —  размер  массива  может  быть 
//произвольным.  Напишите  программу  которая  выведет  на  экран  все возможные  комбинации  из  этих  цифр.  
//Внимание  повторений  быть не должно.(2 часа)

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
//	// Основная программа
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int count = scanner.nextInt();
//		Integer[] sequence = new Integer[count];
//		initSequence(sequence); // Формирование исходной последовательности
//		System.out.println("Неубывающая последовательность и её перестановки:");
//		do {
//			System.out.println(Arrays.deepToString(sequence));
//		} while (Narayana.nextPermutation(sequence, NarayanaTest::less));
//		// x < y — критерий сравнения для неубывающей последовательности
//		System.out.println("Невозрастающая последовательность и её перестановки:");
//		do {
//			System.out.println(Arrays.deepToString(sequence));
//		} while (Narayana.nextPermutation(sequence, NarayanaTest::greater));
//		// x > y — критерий сравнения для невозрастающей последовательности
//	}
//	// Возвращает true, если value_0 меньше value_1, иначе — false
//	static final <T extends Comparable> boolean less(final T value_0, final T value_1) {
//		return value_0.compareTo(value_1) < 0;
//	}
//
//	// Возвращает true, если value_0 больше value_1, иначе — false
//	static final <T extends Comparable> boolean greater(final T value_0, final T value_1) {
//		return value_0.compareTo(value_1) > 0;
//	}
//
//	// Инициализация последовательности
//	static final void initSequence(Integer[] sequence) {
//		// Заполнение последовательности значениями 1, 2, 3…
//		for (int value = sequence.length; value > 0; --value)
//			sequence[value - 1] = value;
//	}
//}
