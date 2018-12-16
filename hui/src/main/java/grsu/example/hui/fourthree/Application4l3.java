package grsu.example.hui.fourthree;

import java.util.Scanner;
import java.util.Random;

public class Application4l3 {

	public static void main(String[] args) {

		int m = 0;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Insert value m:");
			m = input.nextInt();

			if (m <= 0 || m > 7) {
				System.out.println("длина не может быть больше 7, отрицательным числом или нулём");
			}
		} while (m <= 0 || m > 7);
		input.close();
		double[][] matrix = new double[m][m];
		Random random = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				matrix[i][j] = random.nextDouble() * 25.0 - 10.0;
				System.out.print("\t" + matrix[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < matrix.length; i++) {
			double sum = 0.0;
			int z = 0;
			double average = 0.0;
			for (int j = 0; j < matrix[i].length; j++) {

				if (matrix[i][j] > 0) {

					sum += matrix[i][j];
					z = z + 1;

					average = sum / z;
				}
			}

			System.out.println(i + "\t" + "average:   " + average);

		}

	}
}
