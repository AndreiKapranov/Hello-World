package grsu.example.hui.threetwo;

import java.util.Scanner;

public class Application3l2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������� ����� ����� > ");
		int val = scanner.nextInt();
		scanner.close();
		int val1 = val - 7;
		int val2 = val + 7;
		if (val > 0 && val1 % 10 == 0) {
			System.out.print("����� ������������ ������ 7");
		} else {
			if (val < 0 && val2 % 10 == 0)
				System.out.print("����� ������������ ������ 7");
			else {
				System.out.print("����� �� ������������ ������ 7");
			}

		}
	}

}
