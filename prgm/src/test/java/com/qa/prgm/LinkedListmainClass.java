package com.qa.prgm;

public class LinkedListmainClass {

	public static void main(String[] args) {
		LinkedListExplanation list = new LinkedListExplanation();
		list.insert(12);
		list.insert(45);
		list.insert(49);
		
		list.show();
		
		list.insertStart(23);
		list.show();
		
		list.insertWithIndex(1, 73);
		list.show();
	}

}
