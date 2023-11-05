package com.sunbeam;

public class Stack
{
	private int arr[];
	private int top;
	private final int SIZE;
	private Stack maxStack;
	
	public Stack(int size)
	{
		SIZE=size;
		arr=new int[SIZE];
		top=-1;   
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull()
	{
		return top==SIZE-1;
	}
	
	public int getMax()
	{
		return  maxStack.peek();
	}
	
	
	public void push(int data)
	{
		top++;
		arr[top]=data;
		
	}
	public int pop()
	{
		int data=arr[top];
		top--;
	
		return data;
	}
	
	public int peek()
	{
		return arr[top];
	}
	

	public void display()
	{
	for(int i=0;i<=top;i++) {
		System.out.println(" "+arr[i]);
	}
	System.out.println("");
	}
	
	public void sortSelection()
	{
		
	}

}
