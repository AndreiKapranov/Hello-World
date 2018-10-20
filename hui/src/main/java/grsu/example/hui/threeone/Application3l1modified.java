package grsu.example.hui.threeone;

import java.util.Scanner;

public class Application3l1modified {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Первое число= ");
		double val = scanner.nextDouble();
		System.out.print("Второе число= ");
		double val1 = scanner.nextDouble();
		System.out.print("Операция -> ");
		char operation = scanner.next().charAt(0);
		scanner.close();
		switch (operation) {
		case '+':
			double result = val + val1;
			System.out.print(val + "+" + val1 + "=" + result);
			break;
		case '-':
			double result1 = val - val1;
			System.out.print(val + "-" + val1 + "=" + result1);
			break;
		case '*':
			double result2 = val * val1;
			System.out.print(val + "*" + val1 + "=" + result2);
			break;
		case '/':
			if (val1 == 0.0) {
				System.out.print("Ошибка:на нуль делить нельзя!");
			} else {
				double result3 = val / val1;
				System.out.print(val + "/" + val1 + "=" + result3);
			}
			break;
		default:
			System.out.println("Ошибка:неизвестный оператор.");
		}

	};
}
