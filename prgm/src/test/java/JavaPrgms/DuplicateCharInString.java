package JavaPrgms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharInString {

	public static void main(String[] args) {
		String str="indonesiain";
		int len=str.length();
		char ch[]= str.toCharArray();
		
		Set<Character> dupli= new HashSet<Character>();
		
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(ch[i]==ch[j]) {
					dupli.add(ch[i]);
				}
			}
		}
		System.out.println(dupli);
	}
}
