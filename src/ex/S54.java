package ex;

public class S54 {
	/**
	 * Check if the parameter is positive, negative, or zero
	 * 
	 * @param value an integer
	 * @return "positive", "negative", or "zero"
	 */
	public static String checkSign(int value) {
		// TODO
		if (value > 0) {
			return "positive";
		} else if (value < 0) {
			return "negative";
		} else {
			return "zero";
		}

	}

	/**
	 * Check if the parameter is odd
	 * 
	 * @param value an integer
	 * @return "odd" or "even"
	 */
	public static boolean isOdd(int value) {
		// TODO
		if (Math.abs(value / 2) > 0) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Convert the parameter to its English name, if it is in [0..9]
	 * 
	 * @param value an integer
	 * @return "zero" for 0 ... "nine" for 9, or "other"
	 */
	public static String asWord(int value) {
		// TODO
		if (value < 1) {
			return "zero";
		} else if (value > 0 && value < 2) {
			return "1";
		} else if (value > 1 && value < 3) {
			return "2";
		} else if (value > 2 && value < 4) {
			return "3";
		} else if (value > 3 && value < 5) {
			return "4";
		} else if (value > 4 &&value < 6) {
			return "5";
		} else if (value > 5 && value < 7) {
			return "6";
		} else if (value > 6 && value < 8) {
			return "7";
		} else if (value > 7 && value < 9) {
			return "8";
		} else if (value > 8 && value < 10) {
			return "9";
		} else {
			return "other";
		}
		
		
	}

	/**
	 * Convert a value in the interval [0, 100] to a letter in [A, F]
	 * 
	 * A if value > 90 B if value in (80, 90] ... F if value <= 50
	 * 
	 * @param percentile in [0, 100]
	 * @return a letter in [A, F]
	 */
	public static char vote(double percentile) {
		// TODO
		if (percentile <= 50) {
			return  'F';
		} else if (percentile >50 && percentile <60) {
			return 'E';
		} else if (percentile >60 && percentile <70) {
			return 'D';
		} else if (percentile >70 && percentile <80) {
			return 'C';
		} else if (percentile >80 && percentile <= 90) {
			return 'B';
		} else {
			return 'A';
		}
		}


	/**
	 * Leap year checker
	 * 
	 * @param year
	 * @return true if leap year
	 */
	public static boolean isLeapYear(int year) {
		// TODO
		if (year % 100 ==0 && year % 400 !=0) {
			return false;
		} else if (year % 4 == 0) {
			return true;
		}else
		return false;
	}

	/**
	 * Sort the input parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return a sorted array
	 */
	public static int[] sort(int a, int b, int c) {
		int[] result = new int[3];
		// TODO
		if (a>b && b<c) { // a,b,c
		result [0] = a;
		result [1] = b;
		result [2] = c;
	}   else if (a<b && b>c && c<a) { //
		result [0] = a;
		result [1] = c;
		result [2] = b;
	} else if (a<b && b>c && c>a) {
		result [0] = c;
		result [1] = a;
		result [2] = b;
	}else if (b<a && a<c) {
		result [0] = b;
		result [1] = a;
		result [2] = c;
	}else if (b<a && a>c && c<b) {
		result [0] = c;
		result [1] = b;
		result [2] = a;
	}else if (b<a && a>c && c>b) {
		result [0] = b;
		result [1] = c;
		result [2] = a;
	}
		return result;
	}
}