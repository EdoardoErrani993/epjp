package ex_4;

import java.util.Scanner;

public class NumeriPerf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		long number = scanner.nextLong();
		scanner.close();
		System.out.println(numPerf(number));
		
		//System.out.println(numPerf(28) + " 28");
		//System.out.println(numPerf(6) + " 6");
		//System.out.println(numPerf(8128) + " 8128");
		//System.out.println(numPerf(31) + " 31");
		//System.out.println(numPerf(8589869056) + " 8 589 869 056");

	}
	public static boolean numPerf(long n) {
		if (n < 0) {
			return false;
		}

		long sum = 0;
		for (long i = 1; i <= n/2; i++) {
			if (n % i == 0) {
				sum += i;

			}
		}
		return n == sum;

	}
}
