package com.bridgelabz.linkedlist;

public class MyLinkedList {
	private INode head;
	private INode tail;
	
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void add(INode myNode) {
		
		if(tail == null) {
			tail = myNode;
		}
		if (head == null) {
			head = myNode;
		}else {
			INode tempNode = head;
			head = myNode;
			head.setNext(tempNode);
		}
	}
	
	public void append(INode newNode) {
		if(head==null) {
			head=newNode;
		}if(tail==null) {
			tail=newNode;
		}else {
			tail.setNext(newNode);
			tail=newNode;	
		}
		
	}
	
	public void print() {
		INode tempNode = head;
		
		while(tempNode != null) {
			System.out.println(tempNode.getKey());
			tempNode = tempNode.getNext();
		}
	}
}