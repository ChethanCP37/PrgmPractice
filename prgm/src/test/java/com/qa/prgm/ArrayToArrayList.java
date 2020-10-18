package com.qa.prgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayList {

	public static void main(String[] args) {
		//source:  https://beginnersbook.com/2013/12/how-to-convert-array-to-arraylist-in-java/
		System.out.println("1st way: using list.add() method");
		String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};
		ArrayList<String> list = new ArrayList<String>();

		for(int i=0;i<citynames.length;i++) {
			list.add(citynames[i]);
		}
		System.out.println(list);
		System.out.println("------------------------------");
		
		System.out.println("2nd way: using Arrays.asList() method");
		String city[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};
		ArrayList<String> listVal = new ArrayList<String>(Arrays.asList(city));
		System.out.println(listVal);
		System.out.println("------------------------------");
		
		System.out.println("3rd way: using Collections.addAll() method");
		String places[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};
		ArrayList<String> listValues = new ArrayList<String>();
		Collections.addAll(listValues,places);
		System.out.println(listValues);
		System.out.println("------------------------------");
	}
}
