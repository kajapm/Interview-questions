package set5;

public class Pattern2 {
	public static void main(String[] args) {
		new Pattern2().print();
	}

	int n = 4;

	void print() {
		int printer = 1;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(printer++);
			}
			System.out.println();
		}
	}
}
