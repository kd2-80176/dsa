package que2;

public class Queue {
	LinkedList list = new LinkedList();

	public void push(int value) {

		list.addLast(value);
		;

	}

	public void pop() {
		if (list.isEmpty())
			System.out.println("Queue is empty");
		else {

			list.delFirst();
		}
	}

	public void peek() {
		list.getFirst();
	}
}
