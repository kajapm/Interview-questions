package set13;

public class BinaryConvert {
	public static void main(String[] args) {
		new BinaryConvert().convert();
	}

	int n = 132;

	void convert() {
		boolean isMoreThan0 = true;
		char[] arr = (n + "").toCharArray();
		while (isMoreThan0) {
			isMoreThan0 = false;
			String s = "";
			for (int i = 0; i < arr.length; i++) {
				int num = Integer.parseInt(arr[i] + "");
				if (num > 1)
					isMoreThan0 = true;
				if (num > 0) {
					arr[i] = (--num + "").charAt(0);
					s += "1";
				} else
					s += "0";
			}
			System.out.println(Integer.parseInt(s) + " ");
		}
	}
}
