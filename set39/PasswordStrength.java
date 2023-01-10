package set39;

public class PasswordStrength {
	public static void main(String[] args) {
		System.out.println(new PasswordStrength().findPasswordStrength());
	}

	String password = "buctf7/69PP";

	String findPasswordStrength() {
		password += '\0';
		int length = password.length();
		if (length < 7) {
			return "weak";
		}
		password.indexOf(length);
		boolean havingSpecialCharacter = false;
		boolean havingNumerics = false;
		boolean havingCapitals = false;
		for (int i = 0; password.charAt(i) != '\0'; i++) {
			if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')
				havingCapitals = true;
			if (password.charAt(i) >= '0' && password.charAt(i) <= '9')
				havingNumerics = true;
			if ((password.charAt(i) < 'a' || password.charAt(i) > 'z')
					&& (password.charAt(i) < 'A' || password.charAt(i) > 'Z')
					&& (password.charAt(i) < '0' || password.charAt(i) > '9'))
				havingSpecialCharacter = true;
		}
		//System.out.println(havingSpecialCharacter + " " + havingNumerics + " " + havingCapitals);
		if (havingCapitals && havingNumerics && havingSpecialCharacter)
			return "strong";
		if (havingNumerics && havingCapitals)
			return "good";
		return "medium";
	}

}
