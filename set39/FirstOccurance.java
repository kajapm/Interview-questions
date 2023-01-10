package set39;

public class FirstOccurance {
	public static void main(String[] args) {
		new FirstOccurance().findString();
	}

	String s1 = "", s2 = "port";

	void findString() {
		int firstIndex = s1.length(), secondIndex = 0;
		for (int i = 0; i < s2.length(); i++) {
			for (int j = 0; j < s1.length(); j++) {
				if (s2.charAt(i) == s1.charAt(j)) {
					if (firstIndex > j)
						firstIndex = j;
					else if (secondIndex < j)
						secondIndex = j;
					break;
				}
			}
		}
		System.out.println(firstIndex + " " + secondIndex);
		for (int i = firstIndex; i <= secondIndex; i++) {
			System.out.print(s1.charAt(i));
		}
	}
}
