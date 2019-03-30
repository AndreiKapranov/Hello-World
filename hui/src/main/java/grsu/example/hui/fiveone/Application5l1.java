package grsu.example.hui.fiveone;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import java.util.Scanner;

public class Application5l1 {

	static double distance(double x, double y, double x1, double y1) {
		return sqrt(pow(x1 - x, 2) + pow(y1 - y, 2));
	}

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter coordinate x > ");
		double x = scanner.nextDouble();
		System.out.print("Enter coordinate y > ");
		double y = scanner.nextDouble();
		System.out.print("Enter coordinate x1 > ");
		double x1 = scanner.nextDouble();
		System.out.print("Enter coordinate y1 > ");
		double y1 = scanner.nextDouble();
		scanner.close();

		System.out.println("Distance between two points:" + distance(x, y, x1, y1));

	}
}
