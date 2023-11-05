package com.sunbeam;

public class StackMain {

	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		
		Stack st=new Stack(10);
		
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
		
		System.out.println("\nReverse array");
		while(!st.isEmpty())
		{
			System.out.print(" "+st.peek());
			st.pop();
		
		}

	}

}
