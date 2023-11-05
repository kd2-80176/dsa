package com.sunbeam;

public class MainReversePrint {
	public static void main(String[] args ) {
		LinkedList l1= new LinkedList();

		l1.addFirst(40);
		//40
		l1.addFirst(30);
		//30->40
		l1.addFirst(20);
		//20->30->40
		l1.addFirst(10);
		l1.display();
		l1.reverseDisplay();
	}

}
