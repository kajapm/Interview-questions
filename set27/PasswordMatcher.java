package set27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordMatcher {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("((?=.*[0-9]).{5,8})");
		Matcher m = p.matcher("12w3456");
		System.out.println(m.matches());
	}
}
