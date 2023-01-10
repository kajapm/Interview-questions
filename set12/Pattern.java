package set12;

import java.util.ArrayList;
import java.util.Collections;

public class Pattern {
	public static void main(String[] args) {
		new Pattern().print();
	}

	Integer n = 10;
	Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	void print() {
		int printer = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(printer + " ");
				printer += (n - j);
			}
			printer = n - (n - (i + 2));
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);
			list.add(6);
			list.add(7);
			list.add(8);
			list.add(9);
			Collections.shuffle(list);
			System.out.println();
		}
	}
}
