package queue;

public class Arrayqueue {

	private int maxSize = -1;
	private Object[] arrayQueue;
	private int head = 0;
	private int rear = 0;
	
	public Arrayqueue(int maxSize) {
		this.maxSize = maxSize;
		arrayQueue = new Object[maxSize];
	}
	
	public boolean isEmpty() {
		return (head == rear);
	}
	public boolean isFull() {
		return (((rear + 1) % maxSize) == head );
	}
	
	public void push(Object item) {
		if(isFull()) 
			System.out.println("The queue is full");
		rear = (rear + 1) % maxSize;
		arrayQueue[rear] = item; 
	}
	
	public Object front() {
		if(isEmpty()) return -1;
		
		return arrayQueue[head+1];
	}
	
	public Object back() {
		if(isEmpty()) return -1;
		return arrayQueue[rear];
	}
	
	public int size() {
		return Math.abs(head-rear);
	}
	
	public Object pop() {
		if(isEmpty())
			return -1;
		Object item;
		head = (head + 1) % maxSize;
		item = arrayQueue[head];
		
		return item;
	}
}
