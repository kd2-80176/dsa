package com.sunbeam;

public class Mainsort {

	public static void main(String[] args ) {
		LinkedList l=new LinkedList();
		l.addFirst(10);
		l.addFirst(20);
		l.addFirst(30);
		l.addFirst(40);
		l.display();
		//System.out.println("Count = "+l.getCount());
		l.sort();
		l.display();
	}
}
