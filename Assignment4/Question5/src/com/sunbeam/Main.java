package com.sunbeam;

public class Main {
	public static void main(String[] args ) {
		
		LinkedList l= new LinkedList();
		l.addFirst(50);
		l.addFirst(40);
		l.addFirst(30);
		l.addFirst(20);
		l.addFirst(10);
		l.addFirst(60);
		l.display();
		//adding after given node or data
		//l.addAfterNode(20,99);
		l.addBeforeNode(20, 99);
		l.display();
		
	}

}
