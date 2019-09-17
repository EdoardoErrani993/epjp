package s040;

public class exer {
	public static void main(String[] args) {
		boolean[] flags = { true, false, false };

		System.out.println("stampo");
		for (boolean item : flags) {
			System.out.println(item);
		}
		for (int i = 0; i < 3; i++) {
			flags[i] = true;
		}
		System.out.println("stampo");
		for (boolean item : flags) {
			System.out.println(item);
		}
		System.out.println("stampo");
		for (boolean item2 : flags) {
			item2 = false;
			System.out.println(item2);
		}
		System.out.println("stampo");
		for (boolean item : flags) {
			System.out.println(item);
		}
	}
}
