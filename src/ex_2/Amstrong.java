package ex_2;

public class Amstrong {

	public static void main(String[] args) {
		System.out.println(armstrong(153) + " 153");
		System.out.println(armstrong(-4) + " -4");
		System.out.println(armstrong(1) + " 1");
		System.out.println(armstrong(31) + " 31");
		System.out.println(armstrong(542) + " 542");
		System.out.println(armstrong(135353) + " 135353");

	}

	public static boolean armstrong(int n) {
		if (n < 0) {
			return false;
		}

		int c = n;
		int sum = 0;
		final int ORD = (int) (Math.log10(n) + 1);
		while (n > 0) {
			int digit = n % 10;
			n /= 10;
			sum += (int) Math.pow(digit, ORD);
		}

		return c == sum;
	}

}
