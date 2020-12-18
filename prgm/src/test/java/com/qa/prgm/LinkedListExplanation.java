package com.qa.prgm;

public class LinkedListExplanation {

	LinkedListNode head;
	public void insert(int data) {
		LinkedListNode node= new LinkedListNode();
		node.data=data;
		node.next=null;

		if(head==null) {
			head=node;
		}
		else {
			LinkedListNode n= head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;

		}
	}
	public void show() {
		LinkedListNode n=head;
		while(n.next!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}

	public void insertStart(int data) {
		LinkedListNode list= new LinkedListNode();
		list.data=data;
		list.next=null;

		LinkedListNode n=head;
		list.next=n;
		head=list;
		System.out.println("--------------------");
	}

	public void insertWithIndex(int index, int data) {
		LinkedListNode node= new LinkedListNode();
		node.data=data;
		node.next=null;

		if(index==0) {
			insertStart(data);
		}
		else {
			LinkedListNode n= head;
			int val=0;
			while(val<index-1) {
				n=n.next;
				val++;	
			}
			node.next=n.next;
			n.next=node;
			System.out.println("--------------------");
		}

	}
	public void delete(int index) {
		int val=0;
		LinkedListNode n= head;
		if(index==0) {
			
		}
		while(val<index) {
			val++;
			n=n.next;
		}
	}

}
