package com.sunbeam;

public class PrefixEvaluationMain {

	public static int calculate(int op1, char opr, int op2) {
		switch (opr) {
		case '+':
			return op1 + op2;
		case '-':
			return op1 - op2;
		case '*':
			return op1 * op2;
		case '/':
			return op1 / op2;
		case '%':
			return op1 % op2;
		}
		return 0;
	}

	public static int prefixEvaluate(String prefix) {
		Stack st = new Stack(10);
		for (int i= prefix.length()-1;i>=0; i--) {
			char ele = prefix.charAt(i);

			if (Character.isDigit(ele))
				st.push(ele - '0');

			else {
				int op2 = st.pop();
				int op1 = st.pop();
				int res = calculate(op1, ele, op2);
				st.push(res);
			}
		}
		if (!st.isEmpty())
			return st.pop();

		return 0;

	}

	public static void main(String[] args) {
	    String prefix = "+9+9/3*654";

	    System.out.println("Prefix: " + prefix);
	    int res = prefixEvaluate(prefix);
	    System.out.println("Result: " + res);
	}


}
