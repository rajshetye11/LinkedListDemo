package com.bridgelabz.linkedlist;

public class LinkedListRunner {
	public static void main(String[] args) {
		MyNode <Integer> firstNode = new MyNode<Integer>(56);
		MyNode <Integer> secondNode = new MyNode<Integer>(30);
		MyNode <Integer> thirdNode = new MyNode<Integer>(70);
		MyNode <Integer> fourthNode = new MyNode<Integer>(40);
		
		MyLinkedList linkedlist = new MyLinkedList();
		linkedlist.add(firstNode);
		linkedlist.add(secondNode);
		linkedlist.add(thirdNode);
		
		linkedlist.insertElement(secondNode,fourthNode);
		linkedlist.print();
		System.out.println("After deleting 40");
		linkedlist.delete(40);
		linkedlist.print();
		
	}
}
