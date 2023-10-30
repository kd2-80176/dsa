
public class Stack {
	private int top;
	private int size;
	private int arr[];

	public Stack(int size) {
		this.top = size;
		arr = new int[size];
		this.size = size;
	}

	public void push(int data) {
		top--;
		arr[top] = data;

	}

	public void pop() {
		System.out.println("poped element :" + arr[top]);
		top++;
	}

	public int peek() {
		return arr[top];

	}
	public boolean isEmpty() 
	{
		return top==size;
	}
	public boolean isFull() 
	{
	  return top==-1;
	}

}
