package com.qa.prgm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcepts {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(1,"Chethan");
		hm.put(2,"Asha");
		hm.put(3,"Swaroop");
		hm.put(4,"Putta"); //duplicate value at key 3
		hm.put(5,"Shivu"); // one more duplicate value at key 3

		//vvimp: Map doesn't stores values based on index 
		System.out.println("prints latest value at key 5 :"+hm.get(5));
		System.out.println("To print all key value pairs: "+hm.entrySet());
		System.out.println("To get only keys: "+hm.keySet());
		System.out.println("To get only values: "+hm.values());

		System.out.println("-------------------------------");
		System.out.println("To get keys and values one by one using for each loop");
		for(Map.Entry<Integer, String> map:hm.entrySet()) {
			System.out.println("key set using for each loop: "+map.getKey());
			System.out.println("value set using for each loop: "+map.getValue());
		}
		System.out.println("------------------------------------------------");
		if(hm.containsKey(4)){
			System.out.println("Contains mentioned key");
		}else {
			System.out.println("Doesn't contain mentioned key");
		}
		
		if(hm.containsValue("Chethan")) {
			System.out.println("Contains mentioned key");
		}else {
			System.out.println("Doesn't contain mentioned key");
		}
		System.out.println("------------------------------------------------");
		hm.replace(1, "Shanmuka");
		System.out.println("After replacing key 1 with Shanmuka: "+hm);
		System.out.println("Is new value is replaced?? : "+hm.replace(1, "Shanmuka", "NewChethan"));
		System.out.println(hm);
		System.out.println("------------------------------------------------");
		
		
	}

}
