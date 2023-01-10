package set6;

public class DontKnow {
	public static void main(String[] args) {
		new DontKnow().getNumerics();
	}

	String s = "abc15shiv12mari5sivaraj99999";

	void getNumerics() {
		s += '\0';
		s += '\0';
		int i = 0, output = 0, temp = 0;
		while (s.charAt(i) != '\0') {
			while (s.charAt(i) != '\0' && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				temp = temp * 10 + (s.charAt(i) - 48);
				i++;
			}
			output += temp;
			temp = 0;
			i++;
		}
		System.out.println(output);
	}
}
