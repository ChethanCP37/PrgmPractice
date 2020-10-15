package JavaPrgms;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int a[]= {4,12,1,23,4,1,5,16,1,12,11,104,4};
		int len=a.length;
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(a[i]==a[j]) {
					set.add(a[i]);
				}
			}
		}
		System.out.println(set);
	}
}
