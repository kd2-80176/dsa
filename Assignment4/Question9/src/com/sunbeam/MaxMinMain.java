package com.sunbeam;

public class MaxMinMain {
	public static void main(String[] args ) {
		
		LinkedList l1= new LinkedList();
		l1.insert(60);
		l1.insert(40);
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.insert(50);
		
		System.out.println("MAXIMUM = "+l1.getMax());
		System.out.println("MINIMUM = "+ l1.getMin());
		
		
	}

}
