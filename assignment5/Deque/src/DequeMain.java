
public class DequeMain {

	public static void main(String[] args) {
	   Deque q=new Deque();
	   q.pushAtFront(20);
	   q.pushAtRear(30);
	   q.pushAtRear(40);
	   q.pushAtFront(10);
	   q.peekFront();
	   q.peekRear();
	   q.popFront();
	   q.popRear();
	   q.peekFront();
	   q.peekRear();

	}

}
