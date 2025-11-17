package datastructure;

public class QueueUsingArray {
	
	static class Queue{
		static int[] arr;
		static int size;
		static int rear=-1;
		
		public Queue(int size) {
			arr= new int[size];
			this.size = size;						
		}
		
		public static boolean isEmpty() {			
			return rear == -1;			
		}
		
		public static boolean isFull() {			
			return rear == size-1;			
		}
		
		public static void add(int data) {
			if(isFull()) {
				System.out.println("Queue is full");
				return;
			}
			rear++;
			arr[rear]=data;
		}
		
		public static int remove() {
			if(isEmpty()) {
				System.out.println("queue is empty");
				return -1;
			}
			int front = arr[0];
			
			for(int i=0;i<rear;i++) {
				arr[i]=arr[i+1];
			}
			rear--;
			return front;
		}
		
		public static int peek() {
			if(isEmpty()) {
				System.out.println("queue is empty");
				return -1;
			}
			int front=arr[0];
			return front;
		}
	}
	
	
	public static void main(String[] args) {
		Queue q = new Queue(5);
		
		q.add(12);
		q.add(23);
		q.add(45);
		System.out.println(q.remove());
		System.out.println(q.peek());
	}
}
