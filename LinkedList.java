package datastructure;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next = null;
	}
}

class InsertLinkedListData{
	
	Node head = null;
	
	public void insertAtBegin(int data) {
		Node newnode = new Node(data);
		newnode.next=head;
		head=newnode;		
	}
	
	public void insertAtEnd(int data) {
		Node temp=head;
		Node newnode = new Node(data);
		
		if(head==null) {
			head=newnode;
			return;
		}
		
		while(temp.next!=null) {
			temp=temp.next;
		}
		
		temp.next=newnode;		
	}	
	
	public void insertAtMiddle(int pos,int data) {
		Node temp=head;
		Node newnode = new Node(data);
		int count=0;
		
		if(head==null) {
			System.out.println("Linked List is Empty");
			return;
		}
			while(pos-1!=count) {
				temp=temp.next;
				count++;
			}
			newnode.next=temp.next;
			temp.next=newnode;		
		
	}	
	
	
	
	public void displayLinkedList() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}

	public void deleteAtBegin() {
		
		if(head==null) {
			System.out.println("Invaild entery");
		}else {
			head=head.next;
		}
	}

	public void deleteAtEnd() {
		Node temp = head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
		
	}

	public void deleteAtMiddle(int deletevalue) {
		Node temp=head;
		
		while(temp.next.data!=deletevalue) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}

	public void updateAtMiddle(int olddata, int newdata) {
		Node temp = head;
		while(temp.data!=olddata && temp!=null) {
			temp=temp.next;
		}
		temp.data=newdata;		
	}
}

public class LinkedList {
	
	public static void main(String[] args) {
		InsertLinkedListData il = new InsertLinkedListData();
		
		il.insertAtBegin(50);
		il.insertAtBegin(20);
		il.insertAtBegin(10);
		il.insertAtEnd(100);
		il.insertAtMiddle(2,70);
		il.insertAtMiddle(3,80);
		il.insertAtMiddle(4,90);
		il.insertAtMiddle(5,120);
		il.insertAtMiddle(6,170);
		il.displayLinkedList();
		il.updateAtMiddle(120,400);
		il.deleteAtBegin();
		il.deleteAtEnd();
		il.deleteAtMiddle(90);
		
		il.displayLinkedList();
	}
}
