package com.sunbeam;

public class InfixtoPostFixConversionMain {
	public static int prio(char opr) {
		switch (opr) {
		case '$':
			return 1;
		case '/':
			return 2;
		case '*':
			return 2;
		case '%':
			return 2;
		case '+':
			return 3;
		case '-':
			return 3;
		}
		return 0;
	}

	public static String infixToPostfix(String infix) {

		Stack st = new Stack(10);

		StringBuilder postfix = new StringBuilder();

		for (int i = 0; i < infix.length(); i++) {

			char ele = infix.charAt(i);

			if (Character.isDigit(ele))

				postfix.append(ele);

			else if (ele == '(')

				st.push(ele);

			else if (ele == ')') {
				while (st.peek() != '(') {
					postfix.append(st.pop());
				}
				st.pop();
			}

			else {

				while (!st.isEmpty() && prio((char) st.peek()) >= prio(ele)) {

					postfix.append(st.pop());
				}

				st.push(ele);
			}
		}

		while (!st.isEmpty()) {
			postfix.append(st.pop());
		}

		return postfix.toString();
	}

	public static void main(String[] args) {
		String infix = "1$9+3*4-(6+8/2)+7";

		System.out.println("Infix:" + infix);
		String postfix = infixToPostfix(infix);
		System.out.println("Postfix:" + postfix);

	}

}



