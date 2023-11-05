package doublyCircularLinkedList;

public class DoublyCircularLinkedList {
	public class Node {
		private int data;
		private Node prev;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}

	}

	private Node head;

	public DoublyCircularLinkedList() {

		this.head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = newnode;
			head.next = newnode;
			head.prev = newnode;
		} else {
			newnode.next = head;
			newnode.prev = head.prev;
			head.prev.next = newnode;
			head.prev = newnode;
			head = newnode;
		}
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (isEmpty())
			System.out.println("list is empty");

		else {
			newnode.prev = head.prev;
			newnode.next = head;
			head.prev.next = newnode;
			head.prev = newnode;

		}
	}

	public void delfirst() {
		if (isEmpty()) {
			System.out.println("List is empty");
		} else if (head.next == head) {
			head = null;
		} else {
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;

		}
	}

	public void delLast() {
		if (isEmpty())
			System.out.println("List is empty");
		else if (head.next == head) {
			head = null;
		} else {

			head.prev.prev.next = head;
			head.prev = head.prev.prev;
		}
	}

	public void addPos(int pos, int value) {
		Node newnode = new Node(value);
		Node trav;
		trav = head;
		if (isEmpty()) {
			head = newnode;
			newnode.next = head;
			newnode.prev = head;

		} else {
                 if(pos==1)
                	 addFirst(value);
                 else {
			for (int i = 1; i < pos - 1; i++)
			{
				trav=trav.next;
			}
            newnode.next = trav.next;
			newnode.prev = trav;
			trav.next = newnode;
			trav.next.prev = newnode;
		}
		}
	}
	public void delPos(int pos) 
	{
	   if(isEmpty())
	   {
		System.out.println("List is empty");   
	   }
	   else
	   {
		   Node trav=head;
		   if(pos==1) {
			   delfirst();
		   }else {
		   for(int i=1;i<pos;i++) 
			   trav=trav.next;
		   trav.next.prev=trav.prev;
		   trav.prev.next=trav.next;
		   } 
		   
		   
	   }
	}

	public void fdisplay() {
		if (isEmpty()) {
			System.out.print("List is empty");
		}
		Node trav = head;
		System.out.print("List :");
		do {
			System.out.print(" " + trav.data);
			trav = trav.next;

		} while (trav != head);
		System.out.println(" ");
	}

	public void rdisplay() {
		if (isEmpty()) {
			System.out.println("List is empty");
		}
		System.out.print("List :");
		Node trav = head.prev;
		do {
			System.out.print(" " + trav.data);
			trav = trav.prev;
		} while (trav != head.prev);
		System.out.println(" ");
	}

}
