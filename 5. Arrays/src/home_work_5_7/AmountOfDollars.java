//Enter from the keyboard a number (up to a billion), which indicates the number of dollars and cents of the user. Write this number in words.
//For example:
//How much money do you have?
//123,34
//You have: one hundred twenty three dollars thirty four cents.

package home_work_5_7;

//import java.util.Arrays;
import java.util.Scanner;

public class AmountOfDollars {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount of money in format: XXXX.XX ");
		double money = sc.nextDouble();
		
		int dollars = (int) money;
		int cents = (int) ((money - dollars) * 100);
		
		String names[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
				"twenty", "twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five", "twenty-six",
				"twenty-seven", "twenty-eight", "twenty-nine", "thirty", "thirty-one", "thirty-two", "thirty-three",
				"thirty-four", "thirty-five", "thirty-six", "thirty-seven", "thirty-eight", "thirty-nine", "forty",
				"forty-one", "forty-two", "forty-three", "forty-four", "forty-five", "forty-six", "forty-seven",
				"forty-eight", "forty-nine", "fifty", "fifty-one", "fifty-two", "fifty-three", "fifty-four",
				"fifty-five", "fifty-six", "fifty-seven", "fifty-eight", "fifty-nine", "sixty", "sixty-one",
				"sixty-two", "sixty-three", "sixty-four", "sixty-five", "sixty-six", "sixty-seven", "sixty-eight",
				"sixty-nine", "seventy", "seventy-one", "seventy-two", "seventy-three", "seventy-four", "seventy-five",
				"seventy-six", "seventy-seven", "seventy-eight", "seventy-nine", "eighty", "eighty-one", "eighty-two",
				"eighty-three", "eighty-four", "eighty-five", "eighty-six", "eighty-seven", "eighty-eight",
				"eighty-nine", "ninety", "ninety-one", "ninety-two", "ninety-three", "ninety-four", "ninety-five",
				"ninety-six", "ninety-seven", "ninety-eight", "ninety-nine" };

		if (dollars >= 0 && dollars < 1000000000 && cents >= 0 && cents < 100) {
			System.out.print("You have: ");

			if (dollars >= 1000000) {
				if (dollars / 100000000 >= 1) {
					System.out.print(names[dollars / 100000000] + " hundreds ");
				}
				if (dollars % 100000000 / 1000000 == 0 & dollars / 100000000 >= 1) {
					System.out.print(" millions ");
				} else {
					System.out.print(names[dollars % 100000000 / 1000000] + " millions ");
				}
			}

			if (dollars >= 1000) {
				if (dollars % 1000000 / 100000 >= 1) {
					System.out.print(names[(dollars % 1000000) / 100000] + " hundreds ");
				}
				if (dollars % 100000 / 1000 == 0 & dollars % 1000000 / 100000 >= 1) {
					System.out.print(" thousands ");
				} else if (dollars % 1000000 / 1000 != 0) {
					System.out.print(names[(dollars % 100000) / 1000] + " thousands ");
				}
			}

			if (dollars >= 100) {
				if ((dollars % 1000) / 100 != 0) {
					System.out.print(names[(dollars % 1000) / 100] + " hundreds ");
				}
			}

			if (dollars % 100 != 0) {
				System.out.print(names[dollars % 100] + " dollars ");
			} else {
				System.out.print(" dollars ");
			}

			System.out.println("and " + names[cents] + " cents ");

		} else {
			System.out.println("Incorrect enter!");
		}
	}
}

//	public static void main(String[] args) {
//
//		double[] arr1 = new double[1];
//		System.out.println(Arrays.toString(arr1));
//
//		Scanner sc = new Scanner(System.in);
//		String number;
//		System.out.println("How much money do you have?");
//		number = sc.nextLine();
//		System.out.println("You have: " + getDecimalValue(number));
//	}
//
//	public static String getString(int number) {
//		switch (number) {
//		case 0:
//			return "Zero";
//		case 1:
//			return "One";
//		case 2:
//			return "Two";
//		case 3:
//			return "Three";
//		case 4:
//			return "Four";
//		case 5:
//			return "Five";
//		case 6:
//			return "Six";
//		case 7:
//			return "Seven";
//		case 8:
//			return "Eight";
//		case 9:
//			return "Nine";
//		case 10:
//			return "Ten ";
//		case 11:
//			return "Eleven ";
//		case 12:
//			return "Twelve ";
//		case 13:
//			return "Thirteen ";
//		case 14:
//			return "Fourteen ";
//		case 15:
//			return "Fifteen ";
//		case 16:
//			return "Sixteen ";
//		case 17:
//			return "Seventeen ";
//		case 18:
//			return "Eighteen ";
//		case 19:
//			return "Nineteen ";
//		}
//		return "";
//	}
//
//	public static String getTeen(int number) {
//
//		switch (number) {
//		case 2:
//			return "Twenty";
//		case 3:
//			return "Thirty";
//		case 4:
//			return "Fourty";
//		case 5:
//			return "Fifty";
//		case 6:
//			return "Sixty";
//		case 7:
//			return "Seventy";
//		case 8:
//			return "Eighty";
//		case 9:
//			return "Ninety";
//		}
//		return "";
//
//	}
//
//	public static String getWholeWord(int number) {
//
//		String output = "";
//		int input = 0;
//
//		String inputNumberString = String.valueOf(number);
//
//		int lastNum = Integer
//				.valueOf(inputNumberString.substring(inputNumberString.length() - 1, inputNumberString.length()));
//		int numberBeforeLast = (number > 9
//				? (Integer.valueOf(
//						inputNumberString.substring(inputNumberString.length() - 2, inputNumberString.length() - 1)))
//				: 0);
//
//		if (number >= 1000000) {
//			output += getNumMillions(number, input);
//			output += getNumThousands(number %= 1000000, input);
//		} else {
//			if (number >= 1000) {
//				output += getNumThousands(number, input);
//			}
//		}
//		input = number % 1000;
//		if (input >= 100) {
//			output += getNumHundreds(number, input);
//		}
//
//		if (numberBeforeLast > 0) {
//			int tempNum = input;
//			if (numberBeforeLast == 1) {
//				tempNum = Integer.valueOf(String.valueOf(numberBeforeLast) + lastNum);
//				output += getString(tempNum);
//				lastNum = 0;
//				numberBeforeLast = 1;
//			} else {
//				output += getTeen(numberBeforeLast) + " ";
//			}
//		}
//
//		if (lastNum > 0) {
//			output += getString(lastNum) + " ";
//		} else if (numberBeforeLast == 0 && number < 100) {
//			output += getString(lastNum) + " ";
//		}
//		return output;
//	}
//
//	public static String getNumHundreds(int number, int input) {
//		int tempNum = input / 100;
//		if (tempNum == 1) {
//			return getString(tempNum) + " Hundred ";
//		} else {
//			return getString(tempNum) + " Hundreds ";
//		}
//	}
//
//	public static String getNumMillions(int number, int input) {
//		input = number / 1000000;
//		if (input == 1) {
//			return getWholeWord(input) + "Million ";
//		} else {
//			return getWholeWord(input) + "Millions ";
//		}
//	}
//
//	public static String getNumThousands(int number, int input) {
//		input = number / 1000;
//		if (input == 1) {
//			return getWholeWord(input) + "Thousand ";
//		} else {
//			return getWholeWord(input) + "Thousands ";
//		}
//	}
//
//	public static String getDecimalValue(String decimal) {
//		String output = "";
//
//		if (decimal.contains(".")) {
//
//			String partBeforeDecimalPoint = decimal.split("\\.")[0];
//			String partAfterDecimalPoint = decimal.split("\\.")[1];
//
//			if (partBeforeDecimalPoint.length() > 0)
//				output = getWholeWord(Integer.parseInt(partBeforeDecimalPoint));
//
//			if (partAfterDecimalPoint.length() > 0)
//				output += ((output.length() > 0 ? "dollars " : "")
//						+ getWholeWord(Integer.parseInt(partAfterDecimalPoint)) + "cents");
//
//		} else {
//			output = getWholeWord(Integer.parseInt(decimal));
//		}
//		return output;
//	}
//}