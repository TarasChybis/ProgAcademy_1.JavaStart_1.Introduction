//Write the code to flip the array (7, 2, 9, 4) -> (4, 9, 2, 7). The array can be of arbitrary length. (You cannot use an additional array when executing a job.)

package home_work_5_6;
import java.util.Arrays;
public class MirrorRotationOfAnArray {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 7, 2, 9, 4 };
		
		System.out.println(Arrays.toString(arr1));

		for (int i = 0; i < arr1.length / 2; i++) {
            int a = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = a;
        }
        System.out.println(Arrays.toString(arr1));
    }
}