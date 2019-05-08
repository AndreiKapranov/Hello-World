package grsu.example.hui.fivetwo;

import java.util.Scanner;

public class Application5l2 {
	public static int gain(int x) {
		int a = (x - (x % 100)) / 100;
		int c = x % 10;
		int b = ((x % 100) - c)/10;
		x = c * 100 + b * 10 + a;

		return x;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x = 0;
		do {
			System.out.println("Enter positive three-digit integer number> ");
			x = scanner.nextInt();
			if (x < 99 || x > 1000) {
				System.out.println("I said positive three-digit integer number,let's try again. ");

			}
		} while (x < 99 || x > 1000);
		scanner.close();
		System.out.println("Result: " + gain(x));

	}

}
