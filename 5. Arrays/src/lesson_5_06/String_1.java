package lesson_5_06;

public class String_1 {

	public static void main(String[] args) {

		String a = "Java";
		String b = "Jav";
		b = b + "a";
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}

}