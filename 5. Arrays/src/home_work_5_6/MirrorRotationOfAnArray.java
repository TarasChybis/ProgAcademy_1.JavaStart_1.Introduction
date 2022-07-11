//Написать код для зеркального переворота массива (7, 2, 9, 4) -> (4, 9, 2, 7). Массив может быть произвольной длинны. (При выполнении задания использовать дополнительный массив нельзя).

package home_work_5_6;
import java.util.Arrays;
public class MirrorRotationOfAnArray {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 7, 2, 9, 4 };
		
		System.out.println(Arrays.toString(arr1));

		for (int i = 0; i < arr1.length / 2; i++) {
            int а = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = а;
        }
        System.out.println(Arrays.toString(arr1));
    }
}


