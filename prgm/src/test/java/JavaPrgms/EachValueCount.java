package JavaPrgms;

import java.util.HashMap;
import java.util.Map;

public class EachValueCount {

	public static void main(String[] args) {
		String name="ChethanCP";
		Map<Character,Integer> val= new HashMap<Character,Integer>();
		
		char ch[]=name.toCharArray();
		for(int i=0;i<name.length();i++) {
			int count =1;
			for(int j=i;j<name.length();j++) {
				if(ch[i]==ch[j]) {
					count++;
					val.put(ch[i], count);
				}
				else {
					val.put(ch[i],count);
				}
			}
		}
		System.out.println(val);

	}

}
