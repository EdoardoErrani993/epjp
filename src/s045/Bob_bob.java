package s045;

public class Bob_bob {
	public static void main(String[] args) {
		exe("CJEDKerdfe");

		System.out.println("My toUpper(): " + toUpper("CJEDKerdf"));
		System.out.println("toUpper3(): " + toUpper3("CJEDKerdf"));
	}

	public static void exe(String sample) {
		for (int i = 0; i < sample.length(); i++) {
			char c = sample.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				System.out.println((char) (c + 32));
			} else {
				System.out.println(c);
			}
		}
	}

	public static String toUpper(String s) {
		if (s == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder(s.length());

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				sb.append((char) (c - 32));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();

	}

	public static String toUpper3(String s) {

		StringBuilder sb = new StringBuilder(s.length());

		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (cur >= 'a' && cur <= 'z') {
				sb.insert(i, (char) (cur - 32));
			} else {

				sb.insert(i, cur);

			}

		}
		return sb.toString();
	}
}
