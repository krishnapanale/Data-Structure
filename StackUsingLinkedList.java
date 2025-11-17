package datastructure;

class Node1{
	int data;
	Node1 next;
	
	public Node1(int data) {
		this.data=data;
		this.next=null;
	}
}

public class StackUsingLinkedList {
	static Node1 head=null;
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void push(int data) {
		
		Node1 newnode= new Node1(data);
		if(isEmpty()) {
			head = newnode;
			return;
		}
		newnode.next=head;
		head=newnode;		
	}
	
	public int pop() {
		
		if(isEmpty()) {
			return -1;
		}
		int top = head.data;
		head=head.next;	
		return top;
	}
	
	public int peek() {
		
		if(isEmpty()) {
			return -1;
		}
		return head.data;
	}
	
	public static void main(String[] args) {
		StackUsingLinkedList s = new StackUsingLinkedList();
		
		s.push(50);
		s.push(190);
		s.push(3012);
		s.push(344);
		s.push(30);
		s.push(22);
		s.push(300);
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
		
	}
}
