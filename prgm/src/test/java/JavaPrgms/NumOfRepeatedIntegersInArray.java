package JavaPrgms;

import java.util.HashMap;
import java.util.Map;

public class NumOfRepeatedIntegersInArray {

	public static void main(String[] args) {
		int a[]= {2,12,546,5,7,2,5,9,12,53,91,11,21};
		
		Map<Integer, Integer> intCount = new HashMap<Integer, Integer>();
		
		for(Integer i:a) {
			if(intCount.containsKey(i)) {
				intCount.put(i, intCount.get(i)+1);
				
			}
			else {
				intCount.put(i,1);
			}
		}
		System.out.println(intCount);

	}

}
