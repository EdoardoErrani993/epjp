package ex_5;

import java.util.Scanner;

public class Hamming {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string1 = scanner.nextLine();
		String string2 = scanner.nextLine();
		scanner.close();
		System.out.println(hamm(string1, string2));

	}

	public static int hamm(String string1, String string2) {

		int sum = 0;
		for (int i = 0; i < string1.length(); i++) {
			char c = string1.charAt(i);
			char s = string2.charAt(i);
			if (c != s) {
				sum += 1;

			}
		}
		return sum;
	}

}
