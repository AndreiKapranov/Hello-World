package grsu.example.hui.threeone;

public class Application3l1 {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		char operation = '*';
		System.out.println("������ ����� a=" + a);
		System.out.println("������ ����� b=" + b);
		if (operation == '+') {
			int c = a + b;
			System.out.println("�������� -> +");
			System.out.println(a + "+" + b + "=" + c);
		}
		if (operation == '-') {
			int c = a - b;
			System.out.println("�������� -> -");
			System.out.println(a + "-" + b + "=" + c);}
			if (operation == '*') {
				int c = a * b;
				System.out.println("�������� -> *");
				System.out.println(a + "*" + b + "=" + c);}
			if (operation == '/') {
				int c = a / b;
				System.out.println("�������� -> /");
				System.out.println(a + "/" + b + "=" + c);}

		}
	}

