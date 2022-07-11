//Реализуйте метод параметрами которого являются  - целое число, 
//вещественное число и строка. Возвращает он конкатенацию строки с 
//суммой вещественного и целого числа.

package home_work_6_2;

public class HW_6_2 {

	public static void main(String[] args) {

		String sum = "Sum";
		int a = 30;
		double b = 20;
		System.out.println(concat(sum, a, b));

	}

	public static String concat(String a, int o, double p) {
		double d = o + p;
		String e = a + " " + "=" + " " + d;
		return e;
	}

}

//		String area = "AreaOfCircle";
//		int r = 30;
//		double pi = 3.14;
//		System.out.println(concat(area, r, pi));
//
//	}
//
//	public static String concat(String a, int b, double c) {
//		double d = c * (b * b);
//		String e = a + " " + "=" + " " + d;
//		return e;
//	}
//
//}
// 	public static void main(String[] args) {
//		double a = 0.4;
//		int b = 4;
//		String c = "number";
//		System.out.println(concat(a,b,c));
//		
//	}
//	public static String concat(double a, int b, String c) {
//		double sum = a+b;
//		String text = sum  + " " + c;
//		return text;
//	}
//
//}