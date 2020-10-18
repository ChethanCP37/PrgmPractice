package com.qa.prgm;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		int a[] = new int[2];
		a[0]=0;
		a[1]=1;
		System.out.println(a); // prints address of a
		System.out.println(a[0]); // prints 0th index value

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(1,20);
		list.add(1,30); //add(index, value) shifts the value at 1st index to right and inserts new value
		list.add(2, 40);
		list.set(2, 23); // set replaces the values at index 2
		
//		list.remove(0); //it removes value at specified index

		System.out.println(list);
		//		for(int i=0;i<list.size();i++) {
		//			System.out.println(list.get(i));
		//		}
		//		
		//		Iterator<Integer> it = list.iterator();
		//		while(it.hasNext()) {
		//			System.out.println(it.next());
		//		}

	}

}
