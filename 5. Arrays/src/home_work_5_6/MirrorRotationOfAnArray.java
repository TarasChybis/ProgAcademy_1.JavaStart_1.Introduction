//�������� ��� ��� ����������� ���������� ������� (7, 2, 9, 4) -> (4, 9, 2, 7). ������ ����� ���� ������������ ������. (��� ���������� ������� ������������ �������������� ������ ������).

package home_work_5_6;
import java.util.Arrays;
public class MirrorRotationOfAnArray {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 7, 2, 9, 4 };
		
		System.out.println(Arrays.toString(arr1));

		for (int i = 0; i < arr1.length / 2; i++) {
            int � = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = �;
        }
        System.out.println(Arrays.toString(arr1));
    }
}


