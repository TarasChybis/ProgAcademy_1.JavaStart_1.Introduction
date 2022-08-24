//Write your own version of the Arrays.toString() method for int[].

package home_work_7_2;

import java.util.Random;

public class HW_7_2 {

	public static void main(String[] args) {
		
//		int[] arr1 = new int[10];
//	    Random random = new Random();
//		
//	    for(int i = 0; i < arr1.length; i++){
//	    	arr1[i] = random.nextInt(100);
//	    }
//	    
//	    System.out.println(myArrayString(arr1));
	    
		int[] arr2 = new int[] {1, 7, 17, 51, 6, 4};
		System.out.println(myArrayString(arr2));
	}
	
	public static String myArrayString(int[] array) {
		String number = "";
		for(int i = 0; i < array.length; i++){
			number = number + array[i] + " ";
		}
		return number;
	}
}