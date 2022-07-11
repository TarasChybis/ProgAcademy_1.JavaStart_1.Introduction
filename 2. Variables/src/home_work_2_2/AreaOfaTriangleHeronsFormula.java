package home_work_2_2;

import java.util.Scanner;

public class AreaOfaTriangleHeronsFormula {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ââĺäčňĺ äëčíó ńňîđîíű A ňđĺóăîëüíčęŕ ABC (ńě):");
		double a = sc.nextDouble();
		System.out.println("Ââĺäčňĺ äëčíó ńňîđîíű B ňđĺóăîëüíčęŕ ABC (ńě):");
		double b = sc.nextDouble();
		System.out.println("Ââĺäčňĺ äëčíó ńňîđîíű C ňđĺóăîëüíčęŕ ABC (ńě):");
		double c = sc.nextDouble();
		double area;
		double p;

		p = (a + b + c) / 2;

		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println("Ďëîůŕäü ňđĺóăîëüíčęŕ " + area + " ńě2");

	}

}

2)Написать программу которая вычислит и выведет на экран 
площадь треугольника если известны его стороны.
