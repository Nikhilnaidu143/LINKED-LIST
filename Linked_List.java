package com.bridgeLabz.linkedList;

public class Linked_List {
	Node head = null;  // initially we are assigning head as null.
	
	/** printing linked list **/
	
	public <T> void print() {
		Node currentNode = head;
		System.out.println("Linked-List :- ");           // head
		while(currentNode != null) {                    // 56|next --> 30|next --> 70|next --> null 
			System.out.print(currentNode.key + " --> ");
			currentNode = currentNode.next;         
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		/** Displayed welcome message **/
		System.out.println("-----------WELCOME TO LINKED LIST-------------");
		
		/** creating object of Linked_List class **/
		Linked_List linkedList = new Linked_List();   
		
		linkedList.head = new Node(56);                  /** diagram representation **/
		Node node2 = new Node(30);          //   linkedList.head
		Node node3 = new Node(70);          //        |
											//		  V
		linkedList.head.next = node2;       //      56 | next --> 30 | next --> 70 | next --> null
		node2.next = node3;									
			
		linkedList.print();  //printing linkedlist keys/elements/data.
	}	
}
