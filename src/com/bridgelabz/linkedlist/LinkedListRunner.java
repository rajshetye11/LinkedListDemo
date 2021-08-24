package com.bridgelabz.linkedlist;

public class LinkedListRunner {
	public static void main(String[] args) {
		MyNode <Integer> firstNode = new MyNode<Integer>(56);
		MyNode <Integer> secondNode = new MyNode<Integer>(30);
		MyNode <Integer> thirdNode = new MyNode<Integer>(70);
		
		MyLinkedList linkedlist = new MyLinkedList();
//		linkedlist.add(firstNode);
//		linkedlist.add(secondNode);
//		linkedlist.add(thirdNode);
		linkedlist.append(firstNode);	
		linkedlist.append(thirdNode);
		linkedlist.insert(secondNode);
		System.out.println("Before Deleting first node");
		linkedlist.print();
		System.out.println("After Deleting first node");
		linkedlist.pop();
		linkedlist.print();
		System.out.println("After Deleting last node");
		linkedlist.popLast();
		linkedlist.print();
		
	}
}
