package com.qa.prgm;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		System.out.println("Fetching values from array list");
		int a[]= {2,78,43,73,112,54,89};
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(0);
		list.add(1, 200);
		list.addFirst(111);
		list.addLast(999);
		System.out.println("First list based on above added values:    "+list);
		
		list.set(1, 2222);
		System.out.println("After a setting value to particular index: "+list);
		System.out.println("-----------------------------------------------");
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(3333);
		list2.add(1, 4444);
		list2.addFirst(5555);
		list2.addLast(6666);
		System.out.println("Second linked list values are: "+list2);
		
		System.out.println("Adding second list to first");
		list.addAll(list2);
		System.out.println(list);
		
		System.out.println("get first value from list: "+list.getFirst());
		System.out.println("get last value from list: "+list.getLast());
	
		System.out.println("List constains value??? Yes or No: "+list.contains(200));
		System.out.println("First List contains all second list values??? Yes or No: "+list.containsAll(list2));
		
		System.out.println("Both list are same size and same elements??: "+list.equals(list2));
		
		System.out.println("Before removing list is: "+list2);
		System.out.println(list2.remove(1));
		System.out.println("After removing list is: "+list2);
	}

}
