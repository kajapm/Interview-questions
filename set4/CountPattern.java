package set4;

public class CountPattern {
	public static void main(String[] args) {
		new CountPattern().printPattern();
	}

	int n = 7;

	void printPattern() {
		String printer = "1";

		for (int i = 0; i < n; i++) {
			System.out.println(printer);
			printer = countOfElements(printer);
		}
	}

	String countOfElements(String s) {
		s += '\0';
		int count = 1;
		String output = "";
		for (int i = 0; s.charAt(i) != '\0'; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				output += count + "" + s.charAt(i);
				count = 1;
			}
		}
		return output;
	}
}
