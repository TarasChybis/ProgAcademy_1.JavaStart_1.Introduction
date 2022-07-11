package lesson_3_2;

import java.util.Scanner;

public class DayWeekJanuary2022 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int day;

		System.out.println("Input number from 1 to 31");
		day = sc.nextInt();

		// Âàğèàíò switch-case-break-default
		
		if (day >= 1 && day <= 31) {
			
			switch (day % 7) {
			case 3:
				System.out.println("Ïîíåäåëüíèê");
				break;
			case 4:
				System.out.println("Âòîğíèê");
				break;
			case 5:
				System.out.println("Ñğåäà");
				break;
			case 6:
				System.out.println("×åòâåğã");
				break;
			case 0:
				System.out.println("Ïÿòíèöà");
				break;
			case 1:
				System.out.println("Ñóááîòà");
				break;
			case 2:
				System.out.println("Âîñêğåñåíüå");
				break;
			}
						
		} else {
			System.out.println("Îøèáêà ââîäà");
		}

		// Âàğèàíò if - else if - else
		
		if (day >= 1 && day <= 31) {

			if (day % 7 == 3) {
				System.out.println("Ïîíåäåëüíèê");
			} else if (day % 7 == 4) {
				System.out.println("Âòîğíèê");
			} else if (day % 7 == 5) {
				System.out.println("Ñğåäà");
			} else if (day % 7 == 6) {
				System.out.println("×åòâåğã");
			} else if (day % 7 == 0) {
				System.out.println("Ïÿòíèöà");
			} else if (day % 7 == 1) {
				System.out.println("Ñóááîòà");
			} else if (day % 7 == 2) {
				System.out.println("Âîñêğåñåíüå");
			} 
			
		} else {
			System.out.println("Îøèáêà ââîäà");
		}

	}

}
