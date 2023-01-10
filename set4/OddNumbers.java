package set4;

public class OddNumbers {
	public static void main(String[] args) {
		new OddNumbers().printOddNumbers(30, 15);
	}

	void printOddNumbers(int start, int limit) {
		String s = "[ ";
		for (int i = start; i < limit; i++) {
			if (i % 2 != 0)
				s += (i + " ");
		}
		s += "]";
		System.out.println(s);
	}
}
