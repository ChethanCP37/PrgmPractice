package JavaPrgms;

public class PalindromeOrNotPrgm_1 {

	public static void main(String[] args) {
		String str="MADAM"; // MAADAM
		boolean isPalidrome=true;
		for(int i=0;i<str.length()/2;i++) {
			if((str.charAt(i))!=str.charAt((str.length()-1)-i)) {
				isPalidrome=false;
				break;
			}
		}
		if(isPalidrome) {
			System.out.println(str+" is Palindrome");
		}
		else {
			System.out.println(str+" is NOT a Palindrome");
		}
	}

}

