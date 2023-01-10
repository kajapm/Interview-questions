package set5;

public class Pattern1 {
	public static void main(String[] args) {
		new Pattern1().print();
	}
	int n=9;
	void print() {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
