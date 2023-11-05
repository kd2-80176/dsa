package com.sunbeam;

public class StackUsingQueue{

	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		
		Stack st=new Stack(10);
		Queue q=new Queue();
		
		System.out.println("Input array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}

		for(int i=0;i<arr.length;i++)
		{
			st.push(arr[i]);
		}
	    
		System.out.println("\nAfter copying elements of stack into queue");
		
		while(!st.isEmpty())
		{
			q.push(st.pop());
			
		}

		while(!q.isEmpty())
		{
			System.out.print(" "+q.peek());
			q.pop();
		}
		
	}

}
