package recursion;

public class Power {
	public static void main(String[] args) {
		System.out.println(new Power().power(2, 4));
	}

	int power(int num, int power) {
		if (power == 1)
			return num;
		return num * power(num, power - 1);
	}
}
