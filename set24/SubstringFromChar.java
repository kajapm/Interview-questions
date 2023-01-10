package set24;

public class SubstringFromChar {
	public static void main(String[] args) {
		System.out.println(new SubstringFromChar().getString());
	}
	String s="shivasankari";
	char c='a';
	int n=2;
	String getString() {
		s+='\0';
		String output="";
		for(int i=0;s.charAt(i)!='\0';i++) {
			if(n<=0) {
				output+=s.charAt(i);
			}
			if(s.charAt(i)==c) {
				n--;
			}
		}
		return output;
	}
}
