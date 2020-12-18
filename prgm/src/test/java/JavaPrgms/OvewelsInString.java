package JavaPrgms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OvewelsInString {

	public static void main(String[] args) {

		String str="I am the only good person in this world";
		char ch[]=str.toCharArray();
		Map<Character,Integer> map = null;
		map= new HashMap<Character,Integer>();
		for(Character c:ch) {
			if((c=='a')|| (c=='e') || (c=='i') || (c=='o') || (c=='u')) {
				if(map.containsKey(c)) {
					map.put(c, map.get(c)+1);
				}
				else {
					map.put(c,1);
				}
			}
		}
		//		System.out.println(map.entrySet());  //	Or we can use below	
		for(Entry<Character,Integer> val:map.entrySet()) {
			char cc=val.getKey();
			int in=val.getValue();
			System.out.println(cc+" --> "+in);
		}
	}
}
