package JavaPrgms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MoreThanLengthByTwoValuesInArray {

	public static void main(String[] args) {
		//		Given an array of integers find the majority element in it.
		//		given arr : {2,3,41,3,2,2,2,31,1,2,2,3,1,2}
		//		def of majority ele = frequency of ele >= (size of arr)/2

		int arr[]={2,3,41,3,2,2,2,2,2,31,1,2,2,3,1,2};
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();

		for(Integer i:arr){
			if(map.containsKey(i)){
				map.put(i,map.get(i)+1);
			}
			else{
				map.put(i,1);
			}
		}
		int count=(arr.length)/2;
		int max=0;

		for(Entry<Integer, Integer> e : map.entrySet()){
			System.out.println(e);
			int value= e.getValue();
		
			int keys=e.getKey();
			System.out.println("key: "+keys);
			System.out.println("Values: "+value);
			System.out.println(count);
			if(value>count){
			//	max=value;
				System.out.println("----------------"+value);
			}
		}
		System.out.println("Max"+max);
	}
}
