package JavaPrgms;

import java.util.HashMap;

public class CountOfCharInString {

	public static void main(String[] args) {
		String name="ChethanCP";
		HashMap<Character, Integer> charCount = new HashMap<Character,Integer>();
		
		char ch[]=name.toCharArray();
		
		for(char c:ch) {
			if(charCount.containsKey(c)) {
				charCount.put(c,charCount.get(c)+1);
			}
			else {
				charCount.put(c,1);
			}
		}
		System.out.println(charCount);
		System.out.println("---------------------------------");
		System.out.println(charCount.keySet());
		System.out.println("---------------------------------");
		System.out.println(charCount.values());
		System.out.println("---------------------------------");
		System.out.println(charCount.entrySet());
		System.out.println("---------------------------------");
		

	}

}
