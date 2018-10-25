package grsu.example.hui.threefour;

public class Application3l4 {

	public static void main(String[] args) {
		System.out.println("-------------");
		System.out.println("„исло  вадрат");
		System.out.println("-------------");
		int number = 1;

		while (number < 11) {
			if (number % 1 == 0) {
				System.out.println(number + "       " + number * number);
			}
			number++;
		}
		System.out.println("-------------");

	}
}
