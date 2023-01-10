package set1;

public class XPattern {
	public static void main(String[] args) {
		new XPattern().print(7,"program");
	}
	void print(int n,String s) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==i || j==(n-1)-i) {
					System.out.print(s.charAt(j));
				}	
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
