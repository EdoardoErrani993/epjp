package s090ex;

import java.util.Scanner;

public class Adder {
	public static void main(String[] args) {
		System.out.println("Please, enter a few numbers");

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				int n = scanner.nextInt();
				if (n == 0) {
					System.out.println("Bad input, discarded: " + n );
					break;
				}
				if (n % 2 == 0) {
					System.out.println("even");
				}
				if (n % 2 != 0) {
					System.out.println("Odd");
				}
			} else {
				System.out.println("Bad input, discarded: " + scanner.next());
				break;
			}

		}
		scanner.close();
	}

}
