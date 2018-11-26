package grsu.example.hui.fourone;

import java.util.Scanner;

public class Application4l1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int length = 0;
		do {
			System.out.println("Enter array length: ");
			length = input.nextInt();

			if (length <= 0 || length > 10) {
				System.out.println("длина не может быть больше 10, отрицательным числом или нулём");
			}
		} while (length <= 0 || length > 10);

		double array[] = new double[length];

		for (int i = 0; i < length; i++) {
			System.out.println("Insert array element #" + (i + 1) + ":");

			array[i] = input.nextDouble();
		}

		input.close();

		double sum = 0;

		for (int i = 0; i < length; i++) {

			if (array[i] < 0)

				sum += array[i];

		}

		System.out.println("Sum:" + sum);

		double mi = array[0];

		double ma = mi;

		int index_mi = 0;

		int index_ma = 0;

		int x;

		for (x = 1; x < array.length; x++) {

			if (array[x] < mi) {

				mi = array[x];

				index_mi = x;

			}

			if (array[x] > ma) {

				ma = array[x];

				index_ma = x;

			}

		}

		double result = 1.0;
		if (index_mi == (index_ma + 1) || index_mi == (index_ma - 1)) {// чтоб в случае когда mi и ma стоят рядом-не
																		// было Product: 1.0
			result = 0;
		}

		if (index_mi > index_ma) {

			int y;

			for (y = (index_mi - 1); y > index_ma; y--) {

				result = result * array[y];

			}

		} else {

			int y;

			for (y = (index_mi + 1); y < index_ma; y++) {

				result = result * array[y];

			}

		}

		System.out.println("Product:" + result);

	}

}