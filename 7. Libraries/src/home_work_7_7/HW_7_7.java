//Вовочка сидя на уроке писал подряд одинаковые числа. Когда Марья 
//Ивановна забрала у него тетрадь там было несколько рядов чисел. 
//Напишите программу которая определит минимальное число которое 
//писал Вовочка например:
//11111111=>1
//12121212=>12
//121121121=>121

package home_work_7_7;

public class HW_7_7 {

	public static void main(String[] args) {
		String one = "11111111111";
		String two = "121212121212";
		String three = "121121121121";
		String four = "1211121112111211";
		String five = "1245124512451245";

		System.out.println("In sequence '" + one + "' we repeat this number => " + minNumOfSeq(one));
		System.out.println("In sequence '" + two + "' we repeat this number => " + minNumOfSeq(two));
		System.out.println("In sequence '" + three + "' we repeat this number => " + minNumOfSeq(three));
		System.out.println("In sequence '" + four + "' we repeat this number => " + minNumOfSeq(four));
		System.out.println("In sequence '" + five + "' we repeat this number => " + minNumOfSeq(five));
	}

	public static String minNumOfSeq(String str) {
		String min = "";
		boolean stop = false;

		for (int i = 1; i < 100; i++) {
			String s = str.substring(0, i);
			int c = 0;
			for (int j = 0; j < str.length() / s.length(); j = j + i) {
				if (s.equals(str.substring(j, j + i))) {

					min = s;
					stop = true;

				} else {
					c--;
					stop = false;
				}

			}
			if (stop && c == 0) {
				break;
			}
		}
		return min;
	}
}
