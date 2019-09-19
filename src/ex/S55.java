package ex;

public class S55 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		if (first > last) {
		return 0;
	}		
		long c = 0;	
		
		for (int i = first; i <= last; i++) {
			c = i + c;
		}
		return c;
}
	
	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		if (first > last) {
			return 0;
		}
		long c = 0;
		for (int i = first; i <= last; i++) {
        if (i % 2 == 0) {
        	c = i + c;
} 
		}
		return c;
	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
	
		if (value < 0) {
			return 0;
		}
		int i = value - 1;

		while (i > 0) {

			value = value * i;
			i--;
		}
		return value;
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, …)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		int first = 0;
		int second = 1;
		int cur = 0;
		
		if (value == 0) {
			return 0;	
		}
		for (int i = 1; i < value; i++) {
			cur = first + second;
			first = second;
			second = cur;
		}
		return cur;
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[value][value];
		
		for (int i = 0; i < value; i++) {
			
			for ( int j = 0; j < value; j++) {
				result[i][j] = (i+1)*(j+1);
			}
		
			
			}
		return result;
	}
	
	}
