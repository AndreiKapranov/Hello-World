package grsu.example.hui.threetwo;

import java.util.Scanner;

public class Application3l3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter integer value A > ");
		int a = scanner.nextInt();
		System.out.print("Enter integer value B > ");
		int b = scanner.nextInt();
		scanner.close();
		if (b < a) {
			System.out.print("Error ");
		}
		for (int aa = a; aa < b; aa++) {
			if (aa % 3 == 0) {
				System.out.println(aa);
			}
		}

	}

}
