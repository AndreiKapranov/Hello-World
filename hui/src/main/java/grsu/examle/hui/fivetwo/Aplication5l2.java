package grsu.examle.hui.fivetwo;

import java.util.Scanner;

public class Aplication5l2 {

	public static int gain(int x) {

		char[] helloChars = ("" + x).toCharArray();

		char[] helloChars1 = new char[3];

		System.arraycopy(helloChars, 0, helloChars1, 0, helloChars.length);
		helloChars[0] = helloChars[2];
		helloChars[2] = helloChars1[0];
		int invert0 = Integer.parseInt(new String(helloChars));

		return invert0;
	}

	public static void main(String args[]) {

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
