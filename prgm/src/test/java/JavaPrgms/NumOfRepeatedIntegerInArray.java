package JavaPrgms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NumOfRepeatedIntegerInArray {

	public static void main(String[] args) {
		int a[]= {2,12,546,5,7,2,5,9,2,53,91,11,21,7,7,7};
		
		Map<Integer, Integer> intCount = new HashMap<Integer, Integer>();
		
		for(Integer i:a) {
			if(intCount.containsKey(i)) {
				intCount.put(i, intCount.get(i)+1);
				
			}
			else {
				intCount.put(i,1);
			}
		}
		System.out.println(intCount.entrySet());
		
		int maxCount=0;
		int maxInt=0;
		for(Entry<Integer, Integer> en:intCount.entrySet()) {
			if(en.getValue()>maxCount) {
				maxCount=en.getValue();
				maxInt=en.getKey();
			}
			
		}
		System.out.println(maxInt+"-->"+maxCount);
		
	}

}
