package grsu.example.hui.threeone;

import java.util.Scanner;

public class Application3l1modified {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Первое число= ");
		int val = scanner.nextInt();
		System.out.print("Второе число= ");
		int val1 = scanner.nextInt();
		System.out.print("Операция -> ");
		Scanner reader = new Scanner(System.in);
		char operation = reader.next().charAt(0);
		scanner.close();
		reader.close();
		if (val1 == 0 && operation == '/') {
			System.out.print("Ошибка:на нуль делить нельзя!");}
		switch (operation) {
		case '+':
			System.out.print(val + "+" + val1 + "=" + (val + val1));break;
		case '-':
			System.out.print(val + "-" + val1 + "=" + (val - val1));break;
		case '*':
			System.out.print(val + "*" + val1 + "=" + (val * val1));break;
		case '/':
			System.out.print(val + "/" + val1 + "=" + (val / val1));break;
		default:
			System.out.println("Ошибка:неизвестный оператор!");}
			
			}
			;
		}
	
