package com.sunbeam;

public class ProgramMain {
	public static void main(String[] args) {
		
		LinkedList l1= new LinkedList();
		l1.addFirst(10);
		l1.addFirst(20);
        l1.addFirst(30);
        l1.addFirst(40);
        l1.addFirst(50);
      //  l1.display();
        System.out.println(" tail= "+l1.getTaildata());
//        add at last
//      l1.addLast(70);
//      l1.display();
//      l1.deleteLast();
//      l1.display();
       l1.addatPosition(99, 2);
      l1.display();
      l1.deleteatPosition(2);
       l1.display();      
      
        System.out.println("count = "+l1.getCount());
        System.out.println(" tail= "+l1.getTaildata());

	}

}
