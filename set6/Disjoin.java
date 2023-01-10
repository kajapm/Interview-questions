package set6;

public class Disjoin {
	public static void main(String[] args) {
		new Disjoin().getIndex();
	}

	int[] arr = { 0, 0, 0, 1, 0, 6, 12 };

	void getIndex() {
		int length = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				if (arr[i] == 0)
					arr[i] = arr[i - 1];
				length++;
			} else
				break;
		}
		System.out.println(length);
	}
}
