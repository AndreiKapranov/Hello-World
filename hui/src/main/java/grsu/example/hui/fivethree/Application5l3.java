package grsu.example.hui.fivethree;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Application5l3 {
	static double shroom(double x) {

		if (x < 0) {
			return 0.0;
		}
		if (x >= 0 && x != 1.0) {
			return (pow(x, 2) + 1.0);
		}
		if (x == 1.0) {
			return 1.0;
		}
		return x;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter double value> ");
		double x = scanner.nextDouble();
		scanner.close();
		System.out.println("Result: " + shroom(x));

	}
}
