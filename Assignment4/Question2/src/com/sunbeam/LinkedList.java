package com.sunbeam;

public class LinkedList {
	class Node{
		private int data;
		private Node next;
		Node(int value){
			data= value;
			next= null;
		}
	}
	
	private Node tail;
	private int count;
	
	public boolean isEmpty() {
		return tail==null;
	}
	// add first;
	public void addFirst(int data) {
		Node newnode= new Node(data);
		if(isEmpty()) {
			
			tail=newnode;
			tail.next=tail;
			
		}
		else {
			newnode.next=tail.next;
			tail.next=newnode;
			
		}
		count++;
	}
	//add last
	public void addLast(int data) {
		Node newnode= new Node(data);
		if(isEmpty())
		{
		  tail=newnode;
		  tail.next=tail;
			
		}
		else {

			newnode.next=tail.next;
			tail.next=newnode;
			tail=newnode;
		}
		count++;
	}
	//delete first 
	public void deleteFirst() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return ;
			
		}
		else if(tail.next==tail) {
			tail=null;
		}
		else {
			tail.next=tail.next.next;
		}
		count--;
	}
	public int getTaildata() {
		return tail.data;
	}
	//delete last 
	public void deleteLast() {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return ;
		}
		else if(tail.next==tail) {
			tail=null;
			
		}
		else {
			Node trav=tail.next;
			while(trav.next.next!=tail.next) 
				trav=trav.next;
				
			trav.next=tail.next;
			tail=trav;
		}
		count--;
		
	}
	public void deleteAll() {
		tail=null;
	}

	
	
	public  void display() {
		if(isEmpty())
			return;
		//1. create trav and start at head
		System.out.print("List : ");
		Node trav = tail.next;
		do {
			//2. visit(print) current node
			System.out.print("  " + trav.data);
			//3. go on next node
			trav = trav.next;
		}while (trav != tail.next);          //(trav != tail);  //trav != tail.next
		System.out.println("");
		
		
	}
	
	// add at given position 
	public void addatPosition(int data,int pos) {
		
		if(pos<1 || pos>count+1)
			return;
		Node newnode=new Node(data);
		if(isEmpty()) {
			tail=newnode;
		tail.next=tail;
		}
		else if(pos==1) {
			addFirst(data);
		}
		else {
			Node trav=tail.next;
			for(int i=1;i<pos-1;i++) {
				trav=trav.next;
			}
			newnode.next=trav.next;
			trav.next=newnode;
		}
		count++;
		
	}
	
	//delete at position
	public void deleteatPosition(int pos) {
		
		if(pos<1 || pos>count)
			return;
		if(isEmpty()) {
			System.out.println("List  is Empty");
			return ;
		}
		else if(pos==1) {
			deleteFirst();
		   return;
		}
		else
		{
			Node trav = tail.next;
			for(int i=1;i<pos-1;i++) {
				trav=trav.next;			
				}
			trav.next= trav.next.next;
			
		}
		count--;
	}
	public int getCount() {
		return count;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
