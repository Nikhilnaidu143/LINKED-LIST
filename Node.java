package com.bridgeLabz.linkedList;

public class Node<T> {
	T key;                 // key/Data with Generic type.
	Node next = null;      // initially next is assigned as null.
	
	/** Constructor **/
	public Node(T key) {
		this.key = key;
		this.next = next;
	}
	
	/** Getter methods and setter methods. **/
	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
