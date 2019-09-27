package ex_6;

public class Mix {

	public static int[] mergeSorted(int[] left, int[] right) {
		
		int[] res = new int[left.length + right.length];
	    int j=0;
	    int i = 0;
	    
		while (j <left.length && i < right.length) {
	
		res[i] = left[i];
		res[j]  = right[j];
		}
		
		
		
		return res;
	}
}
