package s090ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) throws IOException {
		// System.out.println("Please, enter a few numbers");
		File file = new File("C:\\Evene_Odd.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		PrintWriter pw;
		try {
			pw = new PrintWriter(new FileWriter(file));
			pw.println("12 " + "18 " + "45 " + "89 " + "32 " + "86 " + "35 " + "876 " + "8765 " + "6 " + "455 "
					+ "89656 " + "0 " + "98");
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scanner scanner = new Scanner(file);
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				int n = scanner.nextInt();
				if (n == 0) {
					System.out.println("Bad input, discarded: " + n);
					break;
				}
				if (n % 2 == 0) {
					System.out.println(n + " even");
				}
				if (n % 2 != 0) {
					System.out.println(n + " Odd");
				}
			} else {
				System.out.println("Bad input, discarded: " + scanner.next());
				break;
			}

		}
		scanner.close();
	}
}
