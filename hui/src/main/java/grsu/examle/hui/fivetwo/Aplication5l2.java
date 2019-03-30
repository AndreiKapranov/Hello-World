package grsu.examle.hui.fivetwo;

import java.util.Scanner;

public class Aplication5l2 {
	public static int gain(Integer x) {
		if (x > 0) {

			String helloString = x.toString();

			char[] helloChars = helloString.toCharArray();
			char[] helloChars1 = new char[3];

			System.arraycopy(helloChars, 0, helloChars1, 0, helloChars.length);
			helloChars[0] = helloChars[2];
			helloChars[2] = helloChars1[0];
			String invert = new String(helloChars);

			int invert0 = Integer.parseInt(invert);
			return invert0;
		}
		return 0;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter positive three-digit integer number> ");
		Integer x = scanner.nextInt();
		scanner.close();
		System.out.println("Result: " + gain(x));

	}
}
