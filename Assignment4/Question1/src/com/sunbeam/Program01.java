package com.sunbeam;

public class Program01 {
	public static void main(String[] args ) {
		
		LinkedList l1= new LinkedList();

		l1.addFirst(40);
		//40
		l1.addFirst(30);
		//30->40
		l1.addFirst(20);
		//20->30->40
		l1.addFirst(10);
		//10->20->30->40
		l1.addLast(50);
		l1.display();
		l1.deleteFirst();
		l1.display();
		l1.deleteLast();
		l1.display();

		
		
	}

}
