package com.sunbeam;

public class InfixtoPrefixConversion {
	
	public static int prio(char opr) {
		switch(opr) {
		case '$': return 1;
		case '/': return 2;
		case '*': return 2;
		case '%': return 2;
		case '+': return 3;
		case '-': return 3;
		}
		return 0;
	}


			public static String infixToPrefix(String infix) {
			
			Stack st = new Stack(10);
			
			StringBuilder prefix = new StringBuilder();
			
			for(int i = infix.length()-1 ; i >= 0 ; i--) {
			
				char ele = infix.charAt(i);
				
				if(Character.isDigit(ele))
					
					prefix.append(ele);
			
				else if (ele == ')')
				
					st.push(ele);
			
				else if (ele == '(') {
					while(st.peek() != ')') {
						prefix.append(st.pop());
					}
					st.pop();  
				}
				
				else {
		
					while(!st.isEmpty() && prio((char) st.peek()) > prio(ele)) {
	
						prefix.append(st.pop());
					}
	
					st.push(ele);
				}
			}

			while(!st.isEmpty()) {
				prefix.append(st.pop());
			}
	
			prefix.reverse();
	
			return prefix.toString();
		}
		public static void main(String[] args) {
			String infix = "1$9+3*4-(6+8/2)+7";
			
			System.out.println("Infix:" + infix);
			String prefix = infixToPrefix(infix);
			System.out.println("Postfix:" + prefix);


		}

	}
