package com.bridgelabz.linkedlist;

public class MyNode <K> implements INode<K>  {
	private K key;
	private INode next;
	
	MyNode(K key){
		this.key = key;
		this.next = null;
	}
	
	
	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}
	@Override
	public void setKey(K key) {
		// TODO Auto-generated method stub
		this.key = key;
	}
	@Override
	public INode getNext() {
		// TODO Auto-generated method stub
		return next;
	}
	@Override
	public void setNext(INode next) {
		// TODO Auto-generated method stub
		this.next = next ;
	}


}
