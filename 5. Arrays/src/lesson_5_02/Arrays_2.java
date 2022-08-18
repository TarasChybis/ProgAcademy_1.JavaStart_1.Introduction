//Two-dimensional array

package lesson_5_02;

public class Arrays_2 {

	public static void main(String[] args) {

		int[][] b = new int[4][5];                     // Ad
		for (int i = 0; i < b.length; i++) {           // Loop through rows
			for (int j = 0; j < b[0].length; j++) {    // Loop through columns
				b[i][j] = i + j;                       // Populating with values
				System.out.print(b[i][j] + " ");       // Output on display
			}
			System.out.println();
		}
	}
}