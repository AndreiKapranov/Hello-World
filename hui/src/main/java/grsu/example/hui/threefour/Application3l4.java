package grsu.example.hui.threefour;

public class Application3l4 {

	public static void main(String[] args) {
		System.out.println("-------------");
		System.out.println("„исло  вадрат");
		System.out.println("-------------");
		int number = 1;

		while (number < 11) {

			double result = Math.pow(number, 2);
			System.out.println(number + "       " + result);
			number++;
		}
		System.out.println("-------------");

	}
}
