package set6;

public class Graph {
	public static void main(String[] args) {
		new Graph().print();
	}
	int[] arr= {10,20,15,7,8};
	void print() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i];j++) {
				System.out.print("_");
			}
			System.out.println();
		}
	}
}
