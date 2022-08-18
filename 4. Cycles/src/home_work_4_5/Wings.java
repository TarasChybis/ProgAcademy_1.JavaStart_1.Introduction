//Using a loop (only one) draw an “inverted triangle” shape from *. Moreover, the maximum height of this figure is entered from the keyboard. For example, the maximum height is 4.
//
//*
//**
//***
//****
//***
//**
//*

package home_work_4_5;

import java.util.Scanner;

public class Wings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h;

		System.out.println("Input h");
		h = sc.nextInt();

		for (int i = 1; i <= (2 * h - 1); i++) {
			if (i <= h) {
				System.out.print("*".repeat(i));
			} else  {
				System.out.print("*".repeat(2 * h - i));
			}
			System.out.println();
		}
	}
}