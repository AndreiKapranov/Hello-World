package grsu.example.hui.fourtwo;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Application4l2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int length = 0;
		do {
			System.out.println("Enter array length: ");
			length = input.nextInt();

			if (length <= 0 || length > 10) {
				System.out.println("����� �� ����� ���� ������ 10, ������������� ������ ��� ����");
			}
		} while (length <= 0 || length > 10);

		input.close();
		System.out.println("������:");
		double[] elements = new double[length];

		int i = 0;
		for (i = 0; i < length; i++) {

			elements[i] = ThreadLocalRandom.current().nextDouble(-5.0, 7.0);
			System.out.println(elements[i]);
		}
		System.out.println("���������� ������:");
		for (i = 0; i < length; i++) {
			if (Math.abs(elements[i]) <= 1) {
				elements[i] = 0.0;
			}
			System.out.println(elements[i]);
		}
	}

}
