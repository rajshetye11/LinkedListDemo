package com.bridgelabz.stack;

public class MyLinkedList<K> {
	private INode head;
	private INode tail;
	
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void add(INode myNode) {
		
		if(head == null) {
			head = myNode;
		}
		if (tail == null) {
			tail = myNode;
		}else {
			INode tempNode = head;
			head = myNode;
			head.setNext(tempNode);
		}
	}
	
	public void push(INode myNode) {
		add(myNode);
		
	}
	
	public void pop() {
		System.out.println(head.getKey()+" Popped");
		INode temp = head.getNext();
		head = temp;
	}
	
	public void peek() {
		while(head!=null) {
			System.out.println(head.getKey());
			pop();
		}
	}
	
	
	public void print() {
		StringBuffer print = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		
		while(tempNode != null) {
			print.append(tempNode.getKey());
			if(tempNode != tail) {
				print.append("->");
			}
			tempNode = tempNode.getNext();
			
		}
		System.out.println(print);
	}
}