package que7CircularQueue;

public class CircularQueue {
	private int front;
	private int rear;
	private final int size;
	int count;
	int arr[];
	public CircularQueue( int size) {
	
		this.front = -1;
		this.rear = -1;
		this.size = size;
		this.count=-1;
		this.arr = new int[size];
	}
	public void push(int data)
	{
	  rear=(rear+1)%size;
	  arr[rear]=data;
	  count ++;
	}
	public void pop()
	{
	   front=(front+1)%size;
	   count--;
	}
	public int peek() 
	{
	  return arr[front+1]%size;	
	}
	public boolean isFull()
	{
	  return count==size-1;	
	}
	public boolean isEmpty()
	{
     	return	count==-1;
	}	
	
	
	
	
	

}
