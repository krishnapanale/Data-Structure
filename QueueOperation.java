package examquestiondsa;

class Queue{
	int capacity;
	int[] arr;
	int front;
	int rear;
	int size;
	
	public Queue(int capacity) {
		this.capacity=capacity;
		arr = new int[capacity];
		front=0;
		rear=-1;
		size=0;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public boolean isFull() {
		return size+1==capacity;
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("Queue is Full");
			return;
		}
		rear++;
		arr[rear]=data;
		size++;
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return;
		}
		for(int i =0; i<rear+1;i++) {
			arr[i]=arr[i+1];
		}
		rear--;
		size--;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return 0;
		}
		return arr[front];
	}
	
	public void display() {
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
	}
}

public class QueueOperation {
	public static void main(String[] args) {
		
		Queue que = new Queue(5);
		
		que.enqueue(50);
		que.enqueue(30);
		que.enqueue(10);
		que.enqueue(40);
		
		
		que.display();
		que.dequeue();
		System.out.println();
		que.display();
		System.out.println();
		System.out.println("The front Element :"+que.peek());
		
	}
}
