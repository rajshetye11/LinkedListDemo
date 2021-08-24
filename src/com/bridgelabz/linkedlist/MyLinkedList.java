package com.bridgelabz.linkedlist;

public class MyLinkedList<K> {
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
	
	public void insert(INode newNode) {
		head.setNext(newNode);
		newNode.setNext(tail);		
	}
	
	public void pop() {
		INode tempNode = head.getNext();
		head = tempNode;	
	}
	
	public void popLast() {
		INode tempNode = head ;
		while (tempNode.getNext() != tail) {
			tempNode = tempNode.getNext();
		}
		tail = tempNode;
		tempNode.setNext(null);
		
	}
	
	public void search(K key) {
		INode tempNode = head;
		while (tempNode != tail) {
			if(tempNode.getKey() == key) {
				System.out.println(key+ " Key Found");
				break;
			}
			tempNode = tempNode.getNext();
		}
	}
	
	
	public void delete(K key) {
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			if ((tempNode.getNext().getKey()).equals(key)) {
				INode tempLast = tempNode.getNext().getNext();
				tempNode.setNext(tempLast);
				break;
			}
			tempNode = tempNode.getNext();
		}
	}
	
	public void insertElement(INode presentNode,INode newNode) {
		INode tempNode = head;
		while (tempNode != tail) {
			if(tempNode.getKey().equals(presentNode.getKey())) {
				tempNode.setNext(newNode);
				newNode.setNext(tail);
			}
			tempNode = tempNode.getNext();
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