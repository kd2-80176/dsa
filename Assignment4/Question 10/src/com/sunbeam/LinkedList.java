package com.sunbeam;

public class LinkedList {

	class Node {
		private Employee emp;
		private Node next;

		public Node(Employee e) {
			emp = new Employee();
			emp = e;
		}

		public Employee getEmp() {
			return emp;
		}
	}

	private Node head;

	private int count;

	public LinkedList() {
		head = null;

	}

	public int getCount() {
		return count;
	}

	public boolean isEmpty() {
		return head == null;
	}

	// Employee addition at first position
	public void add(Employee e) {
		Node newnode = new Node(e);
		if (isEmpty())
			head = newnode;
		else {
			newnode.next = head;
			head = newnode;
		}

	}

	// Display all employees
	public void displayAll() {

		if (isEmpty())
			return;

		Node trav = head;
		while (trav != null) {
			System.out.println(" " + trav.emp);
			trav = trav.next;
		}

	}

	// search employee by name
	public Node searchByName(String name) {
		if (isEmpty())
			return null;
		Node trav = head;
		while (trav != null) {
			if (trav.emp.getName().equals(name)) {

				return trav;
			}
			trav = trav.next;
		}
		return trav;
	}

	// delete employee by id
	public void deleteById(int id) {
		if (isEmpty())
			return;
		Node trav = head;
		Node prev = null;
		// has only one head;
		if (trav.next == null) {
			if (trav.emp.getId() == id)
				head = null;
			return;
		}
		while (trav.next != null && trav.emp.getId() != id) {
			prev = trav;
			trav = trav.next;
		}
		//first node
		if(trav.next!=null && trav.emp.getId()==id) {
			head=trav.next;
			return;
		}
         //last node 
		else if (trav.next == null && trav.emp.getId() == id) {
			prev.next = trav.next;
			return;
		}
		//middle node
		else if (trav.next != null && trav.emp.getId() == id) {
			prev.next = trav.next;
			return;
		}

	}
	
	//update salary of emp
	public void updateSal(Double salary,int id) {
		
		if(isEmpty())
			return ;
		Node trav= head;
		//list containing single node
		if(trav.next==null && trav.emp.getId()==id) {
			trav.emp.setSalary(salary);
		}
		else {
			while(trav!=null && trav.emp.getId()!=id) {
				trav=trav.next;
			}
			if(trav==null) {
				System.out.println("No such Employee with given ID is present");
			}else {
				trav.emp.setSalary(salary);
			}
	
		}
		
		
		
	}

	/*
	 * //insert in sorted manner; public void insert(int data) { Node newnode= new
	 * Node(data); if(isEmpty()) head=newnode; else { Node trav=head; Node
	 * prev=null; while (trav.next!=null && trav.data<data ) { prev=trav;
	 * trav=trav.next; } if(trav.data>=data && prev!=null) { newnode.next=trav;
	 * prev.next=newnode; if(trav==head) head= newnode; } else if(trav.data>= data
	 * && prev==null) { newnode.next=trav; if(trav==head) head=newnode; } else
	 * {//trav.data<data newnode.next=trav.next; trav.next=newnode;
	 * 
	 * 
	 * }
	 * 
	 * } }
	 */

}
