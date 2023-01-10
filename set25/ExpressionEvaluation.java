package set25;

public class ExpressionEvaluation {
	public static void main(String[] args) {
		System.out.println(new ExpressionEvaluation().evaluate());
	}

	String s = "-7-2*3";

	String evaluate() {
		s += "+";
		s+='\0';
		int sum = 0, temp = 0;
		char c = '+';
		boolean haveOperator = false;
		for (int i = 0; s.charAt(i) != '\0'; i++) {
			if (haveOperator && (s.charAt(i) < '0' || s.charAt(i) > '9')) {
				return "invalid expression";
			} else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				temp = temp * 10 + (s.charAt(i) - '0');
				haveOperator = false;
			} else {
				if (c == '+' && !haveOperator) {
					sum += temp;
					temp = 0;
					c = s.charAt(i);
					haveOperator = true;
				} else if (c == '-' && !haveOperator) {
					sum -= temp;
					temp = 0;
					c = s.charAt(i);
					haveOperator = true;
				} else if (c == '*' && !haveOperator) {
					sum *= temp;
					temp = 0;
					c = s.charAt(i);
					haveOperator = true;
				} else if (c == '/' && !haveOperator) {
					sum /= temp;
					temp = 0;
					c = s.charAt(i);
					haveOperator = true;
				}
			}
		}

		return sum + "";
	}
}
