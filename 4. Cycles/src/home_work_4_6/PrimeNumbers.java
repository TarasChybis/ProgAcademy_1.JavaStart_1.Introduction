//Use loops to display all prime numbers from 1 to 100 ()
//A prime number is a number that is only divisible by 1 or itself. The first prime numbers are 2, 3, 5, 7…

package home_work_4_6;

public class PrimeNumbers {

	public static void main(String[] args) {
		
//		Option 1
		
//		int a = 0;
//		
//        for (int i = 1; i <= 100; i++) {
//            for (int j = 1; j <= i; j++) {
//                if (i / j * j == i){
//                    a++;
//                }
//            }
//            if (a <= 2){
//                System.out.println(i);
//            }
//            a = 0;
//        }

//      Option 2
        
        for (int i = 1; i <= 100; i++) {
			boolean a = false;
			int count = 0;
			for (int j = 1; j <= 100; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
//				System.out.print(i + ", ");
				System.out.println(i);
			}
		}
	}
}