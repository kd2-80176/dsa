package com.sunbeam;

public class PostfixEvaluationMain {

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

	public static int postfixEvaluate(String postfix) {
		Stack st = new Stack(10);
		for (int i = 0; i < postfix.length(); i++) {
			char ele = postfix.charAt(i);
			if (Character.isDigit(ele))
				st.push(ele - '0');

			else {
				int op2 = st.pop();
				int op1 = st.pop();

				int res = calculate(op1, ele, op2);
				st.push(res);
			}
		}
		if(!st.isEmpty())
			return st.pop();
	
		return 0;

	}

	public static void main(String[] args) {
		String postfix = "456*3/9+9+7-";

		System.out.println("Postfix:" + postfix);
		int res = postfixEvaluate(postfix);
		System.out.println("Result:" + res);
	}

}
