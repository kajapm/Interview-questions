package set1;

public class GrandChild {
	public static void main(String[] args) {
		new GrandChild().findGrandchild();
	}

	String[][] childNParent = { { "luke", "shaw" }, { "wayne", "rooney" }, { "rooney", "ronaldo" },
			{ "shaw", "rooney" } };

	void findGrandchild() {
		String grandPaa = "ronaldo";
		String dad = "";
		int count = 0;

		for (int i = 0; i < childNParent.length; i++) {
			if (childNParent[i][1].equals(grandPaa)) {
				dad = childNParent[i][0];
				break;
			}
		}

		for (int i = 0; i < childNParent.length; i++) {
			if (childNParent[i][1].equals(dad)) {
				count++;
			}
		}

		System.out.println(grandPaa + " " + count);
	}
}
