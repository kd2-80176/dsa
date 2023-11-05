package com.sunbeam;

public class LinkedList {
	
		
		class Node{
			private int data;
			private Node next;
			public Node(int value) {
				data=value;
			}
		}
		
		private Node head;
		private Node tail;
		private int count ;
		
		public LinkedList() {
			head=null;
			tail= null;
		}
		
		public int getCount() {
			return count;
		}
		public  boolean isEmpty() {
			return head==null;
		}
		//add first
		public  void addFirst(int data) {
			Node newnode= new Node(data);
			if(isEmpty()) {
				head = newnode;
				tail=newnode;
			}
				else {
				newnode.next=head;
				head=newnode;
				
			}
			count++;
			
		}
		//delete first
		public void deleteFirst() {
			if(isEmpty())
				System.out.println("List is Empty");
			else {
				head= head.next;
			}
			count--;
		}
		
		//add last
		public void addLast(int data) {
			Node newnode= new Node(data);
			if(isEmpty())
				System.out.println("list is Empty");
			else {
				Node trav= head;
				while(trav.next!=null) {
					trav= trav.next;
				}
				trav.next= newnode;	
				tail=newnode;
				
			}
			count++;
			
		}
		//delete last
		
		public void deleteLast() {
			if(isEmpty()) 
				System.out.println("List is Empty");
		  else if (head.next==null) {
					head=null;
					tail=null;
		  }
				
			
			else {
				Node trav= head;
				while (trav.next.next!=null)
				{
					trav= trav.next;
				}
				trav.next=null;
				tail= trav;
			}
			count--;
		}
		//display all 
		public void display()
		{
			Node trav = head;
			System.out.print("List :");
			while(trav != null) {
				
				System.out.print("  " + trav.data);
				
				trav = trav.next;
			}
			System.out.println("");
		}
		
		public void deleteAll() {
			head=null;
		}
		
		
		//get mid of linkedlist
		public int mid() {
			Node t1=head;
			Node t2=head;
			while(t2.next!=null && t2.next.next!=null) {
				t1=t1.next;
				t2=t2.next.next;
			}
			return t1.data;
		}
		

	}



