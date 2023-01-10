package recursion;

public class Countdown {
	public static void main(String[] args) {
		new Countdown().countDown(5);
	}

	void countDown(int n) {
		if (n < 0)
			return;
		System.out.println(n);
		countDown(n - 1);
	}
}
