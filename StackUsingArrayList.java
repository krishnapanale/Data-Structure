package datastructure;

import java.util.ArrayList;

//add()-to add the element
//get()= to get the element
//set()- to replace the element
//remove()= to remove the element
//remove(Integer.valueOf(number))- to remove element by value
//size()- to get the size of arraylist
//isEmpty()- to check list is empty

public class StackUsingArrayList {
	static ArrayList<Integer> list = new ArrayList<>();
	
	public static boolean isEmpty() {
		return list.size()==0;
	}
	
	public static void push(int data) {
		list.add(data);
	}
	
	public static int pop() {
		
		if(isEmpty()) {
			return -1;
		}
		int top=list.get(list.size()-1);
		list.remove(list.size()-1);
		return top;
	}
	
	public static int peek() {
		if(isEmpty()) {
			return -1;
		}
		int top =list.get(list.size()-1);
		return top;
	}
	
	public static void main(String[] args) {
		push(50);
		push(40);
		push(60);
		push(30);
		push(20);
		push(10);
		
		while(!isEmpty()) {
			System.out.println(peek());
			pop();
		}
	}
}

