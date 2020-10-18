package com.qa.prgm;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClassConcepts {

	public static void main(String[] args) {
		// source: 1. https://www.geeksforgeeks.org/set-in-java/#:~:text=on%20the%20HashSet.-,1.,respect%20to%20the%20generated%20hash.
		// 2. https://www.geeksforgeeks.org/set-in-java/#:~:text=on%20the%20HashSet.-,1.,respect%20to%20the%20generated%20hash.
		System.out.println("hs.add() method");
		Set<String> hs= new HashSet<String>();
		hs.add("a");
		hs.add("B");
		hs.add("A");
		hs.add("z");
		hs.add("");
		hs.add(null);
		hs.add("K");
		System.out.println(hs);
		System.out.println("--------------------------------");
		
		System.out.println("hs.addAll() method");
		Set<String> hsAddAll= new HashSet<String>();
		hsAddAll.add("asha");
		hsAddAll.add("chethan");
		hsAddAll.add("bothOfUs");
		hs.addAll(hsAddAll);
		System.out.println(hs);
		System.out.println("--------------------------------");
		
		System.out.println("hs.addAll() method");
		hs.remove("bothOfUs");
		System.out.println(hs);
		System.out.println("--------------------------------");
		
		System.out.println("hs.contains method");
		System.out.println("bothOfUs presnet?? "+hs.contains("bothOfUs"));
		System.out.println("Asha presnet?? "+hs.contains("asha"));
		System.out.println("--------------------------------");
		
		System.out.println("hs.clear() method");
		hsAddAll.clear();
		System.out.println("After clearing set--> "+hsAddAll);
		System.out.println("After clearing is set is empty?? "+hsAddAll.isEmpty());
		hsAddAll.add("New Value");
		System.out.println("After adding new value to cleared set reference -> "+hsAddAll);
		System.out.println("--------------------------------");
		
		System.out.println("hs.hashCode() method");
		System.out.println("hashCode value of set reference value: "+hsAddAll.hashCode());
		System.out.println("set size is: "+hsAddAll.size());
		
		System.out.println("TreeSet concept");
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(23);
		ts.add(1);
		ts.add(47);
		ts.add(33);
		ts.add(13);
		
		System.out.println("Treeset mains ascending order sorting by default: "+ts);
	}

}
