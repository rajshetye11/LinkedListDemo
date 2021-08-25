package com.bridgelabz.stack;

public class StackRunner {
		public static void main(String[] args) {
			MyNode<Integer> firstNode = new MyNode<Integer>(56);
			MyNode<Integer> secondNode = new MyNode<Integer>(30);
			MyNode<Integer> thirdNode = new MyNode<Integer>(70);
			
			MyLinkedList linkedlist = new MyLinkedList();
			linkedlist.push(firstNode);
			linkedlist.push(secondNode);
			linkedlist.push(thirdNode);
			System.out.println("Stack");
			linkedlist.print();
		}
}
