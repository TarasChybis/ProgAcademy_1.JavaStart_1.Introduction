package lesson_7_3;

public class FormatterA {

	public static void main(String[] args) {

		String text = String.format("Hellow Word %.2f", Math.PI);
		
		System.out.println(text);
		
		System.out.println(doubleToString(Math.PI, 2));
	}

	public static String doubleToString(double number, int n) {
		return String.format("%." + n + "f", number);
	}	
}