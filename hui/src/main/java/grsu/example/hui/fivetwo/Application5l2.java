package grsu.example.hui.fivetwo;

import java.util.Scanner;

public class Application5l2 {
	public static int gain(int x) {
		int x1 = x;
		if (x % 10 == 0) {
			while (x >= 100) {
				if (x >= 100) {
					x = x - 100;
				}
			}
		}
		if (x % 10 == 1) {
			while (x > 200) {

				if (x > 200) {
					x = x - 100;
				}
			}
		}
		if (x % 10 == 2) {
			while (x < 200 || x > 300) {

				if (x < 200) {
					x = x + 100;
				}
				if (x > 300) {
					x = x - 100;
				}
			}
		}
		if (x % 10 == 3) {
			while (x < 300 || x > 400) {

				if (x < 300) {
					x = x + 100;
				}
				if (x > 400) {
					x = x - 100;
				}
			}
		}
		if (x % 10 == 4) {
			while (x < 400 || x > 500) {

				if (x < 400) {
					x = x + 100;
				}
				if (x > 500) {
					x = x - 100;
				}
			}
		}
		if (x % 10 == 5) {
			while (x < 500 || x > 600) {

				if (x < 500) {
					x = x + 100;
				}
				if (x > 600) {
					x = x - 100;
				}
			}
		}
		if (x % 10 == 6) {
			while (x < 600 || x > 700) {

				if (x < 600) {
					x = x + 100;
				}
				if (x > 700) {
					x = x - 100;
				}
			}
		}
		if (x % 10 == 7) {
			while (x < 700 || x > 800) {

				if (x < 700) {
					x = x + 100;
				}
				if (x > 800) {
					x = x - 100;
				}
			}
		}
		if (x % 10 == 8) {
			while (x < 800 || x > 900) {

				if (x < 800) {
					x = x + 100;
				}
				if (x > 900) {
					x = x - 100;
				}
			}
		}
		if (x % 10 == 9) {
			while (x < 900) {

				if (x < 900) {
					x = x + 100;

				}
			}
		}

		if (x1 < 200) {
			while (x1 % 10 != 1) {

				if (x1 % 10 < 1) {
					x1++;
					x++;
				} else {
					x1--;
					x--;
				}
			}
		}
		if (x1 >= 200 && x1 < 300) { 
			while (x1 % 10 != 2) {

				if (x1 % 10 < 2) {
					x1++;
					x++;
				} else {
					x1--;
					x--;
				}
			}
		}
		if (x1 >= 300 && x1 < 400) {
			while (x1 % 10 != 3) {

				if (x1 % 10 < 3) {
					x1++;
					x++;
				} else {
					x1--;
					x--;
				}
			}
		}
		if (x1 >= 400 && x1 < 500) {
			while (x1 % 10 != 4) {

				if (x1 % 10 < 4) {
					x1++;
					x++;
				} else {
					x1--;
					x--;
				}
			}
		}
		if (x1 >= 500 && x1 < 600) {
			while (x1 % 10 != 5) {

				if (x1 % 10 < 5) {
					x1++;
					x++;
				} else {
					x1--;
					x--;
				}
			}
		}
		if (x1 >= 600 && x1 < 700) {
			while (x1 % 10 != 6) {

				if (x1 % 10 < 6) {
					x1++;
					x++;
				} else {
					x1--;
					x--;
				}
			}
		}
		if (x1 >= 700 && x1 < 800) {
			while (x1 % 10 != 7) {

				if (x1 % 10 < 7) {
					x1++;
					x++;
				} else {
					x1--;
					x--;
				}
			}
		}
		if (x1 >= 800 && x1 < 900) {
			while (x1 % 10 != 8) {

				if (x1 % 10 < 8) {
					x1++;
					x++;
				} else {
					x1--;
					x--;
				}
			}
		}
		if (x1 >= 900 && x1 < 1000) {
			while (x1 % 10 != 9) {

				if (x1 % 10 < 9) {
					x1++;
					x++;
				} else {
					x1--;
					x--;
				}
			}
		}

		return x;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x = 0;
		do {
			System.out.println("Enter positive three-digit integer number> ");
			x = scanner.nextInt();
			if (x < 99 || x > 1000) {
				System.out.println("I said positive three-digit integer number,let's try again. ");

			}
		} while (x < 99 || x > 1000);
		scanner.close();
		System.out.println("Result: " + gain(x));

	}

	}


