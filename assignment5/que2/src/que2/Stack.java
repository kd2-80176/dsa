package que2;

public class Stack {

	LinkedList list = new LinkedList();

	public void push(int value) {

		list.addLast(value);

	}

	public void pop() {
		if (list.isEmpty())
			System.out.println("Stack is empty");
		else {
			list.delLast();
		}
	}

	public void peek() {
		list.getLast();
	}

}
