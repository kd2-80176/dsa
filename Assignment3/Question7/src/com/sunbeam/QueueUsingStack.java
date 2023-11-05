//package com.sunbeam;
//
//public class QueueUsingStack{
//
//	public static void main(String[] args) 
//	{
//		int arr[]= {10,20,30,40,50,60,70,80,90,100};
//		
//		Stack st=new Stack(10);
//		Queue q=new Queue();
//		
//		System.out.println("Input array");
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]);
//			System.out.print(" ");
//		}
//		System.out.println("Stack");
//
//		for(int i=0;i<arr.length;i++)
//		{
//			st.push(arr[i]);
//		}
//	
//		System.out.println("\nAfter copying elements of stack into queue");
//		
//		while(!st.isEmpty())
//		{
//			q.push(st.pop());
//			
//		}
//
//		while(!q.isEmpty())
//		{
//			System.out.print(" "+q.peek());
//			q.pop();
//		}
//		
//	}
//
//}

package com.sunbeam;

import java.util.Stack;

public class QueueUsingStack {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int data) {
        stack1.push(data);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            throw new IllegalStateException("Queue is empty.");
        }
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty()) {
            return stack2.peek();
        } else {
            throw new IllegalStateException("Queue is empty.");
        }
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        int[] arr = {10, 20, 30, 40, 50};

        for (int item : arr) {
            queue.enqueue(item);
        }

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
    }
}

