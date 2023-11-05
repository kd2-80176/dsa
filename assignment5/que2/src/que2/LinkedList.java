package que2;


public class LinkedList {
	public class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
			this.prev = null;
		}

	}

	private Node head;

	public LinkedList() {
		this.head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = newnode;
			newnode.prev = head;
			newnode.next = head;
		}
		{
			head.prev.next = newnode;
			newnode.next = head;
			newnode.prev = head.prev;
			head.prev = newnode;
			head = newnode;

		}
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = newnode;
			newnode.next = head;
			newnode.prev = head;

		} else {
			newnode.next = head;
			newnode.prev = head.prev;
			head.prev.next = newnode;
			head.prev = newnode;
		}
	}

	public void delFirst() {
		if (isEmpty()) {
			System.out.println("List is empty");
		} else if (head.next == head) {
			head = null;
		} else {
			head.next.prev = head.prev;
			head = head.next;
		}
	}

	public void delLast() {
		if (isEmpty()) {
			System.out.println("List is empty");

		} else if (head.next == head) {
			head = null;

		}
		else{
            head.prev.prev.next=head;
            head.prev=head.prev.prev;
		}
	}
	public void getLast()
	{
	   if(isEmpty())
		   System.out.println("List is empty");
	   else
		   System.out.println(" "+head.prev.data);
	}
	public void getFirst() 
	{
	  if(isEmpty())
		  System.out.println("List is empty");
	  else
		  System.out.println(" "+head.data);
	}

	public void fDisplay() {
		if (isEmpty()) {
			System.out.println("List is empty");
		} else {
			System.out.print("List :");
			Node trav = head;
			do {
				System.out.print(" " + trav.data);
				trav = trav.next;

			} while (trav != head);
			System.out.println("");
		}
	}

}
