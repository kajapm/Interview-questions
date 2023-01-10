package set39;

import java.util.Arrays;

public class Pangram {
	public static void main(String[] args) {
		System.out.println(new Pangram().findPangram());
	}

	boolean[] letters = new boolean[26];

	String s = "abDcefGhijkLMNopQrstuvwxYZ";

	boolean findPangram() {
		s += '\0';
		for (int i = 0; s.charAt(i) != '\0'; i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				letters[s.charAt(i) - 'a'] = true;
			} else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				letters[s.charAt(i) - 'A'] = true;
			}
		}
		for (int i = 0; i < 26; i++) {
			if (!letters[i])
				return false;
		}
		return true;
	}
}
