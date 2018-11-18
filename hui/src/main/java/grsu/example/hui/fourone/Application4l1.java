package grsu.example.hui.fourone;

import java.util.Scanner;

public class Application4l1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int size = input.nextInt();
		if (size > 10) {
			System.out.println("Error");
		}
		double array[] = new double[size]; 
		System.out.println("Insert array elements:");
		

		for (int i = 0; i < size; i++) {
			array[i] = input.nextDouble(); 
		}
		input.close();
		double sum = 0;
		for (int i = 0; i < size; i++) {
			if (array[i] < 0)
				sum += array[i];
		}
		System.out.println("Sum:" + sum);
		
		double mi = array[0];
		double ma = mi;
		int index_mi = 0;
		int index_ma = 0;
		int x;
		for (x = 0; x < array.length; x++) {
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
		if (index_mi > index_ma) {
			
			int y;
			for (y = (index_mi - 1); y != index_ma; y--) {

				result = result * array[y];
			}
		} else {
			
			int y;
			for (y = (index_mi + 1); y != index_ma; y++) {
				result = result * array[y];
			}
		}
		System.out.println("Product:" + result);
	}
}
