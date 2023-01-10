package recursion;

public class Binary {
	public static void main(String[] args) {
		System.out.println(new Binary().convert(10));
	}

	String convert(int decimal) {
		if (decimal == 0)
			return "";
		return convert(decimal / 2) + decimal % 2;
	}
}
