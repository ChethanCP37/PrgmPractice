package JavaPrgms;

public class CanWeMakeGivenStringPalindromeOrNot {

	public static void main(String[] args) {
		String str="MADCAM";
		boolean isPalind=false;

		if(str.length()%2==0) {
			for(int i=0;i<str.length();i++) {
				for(int j=i+1;j<str.length();j++) {
					if(str.charAt(i)==str.charAt(j))
					{
						isPalind=true;
					}
				}
			}
			if(isPalind) {
				System.out.println("Can make a palindrome");
			}
			else {
				System.out.println("Can't make a palindrome");
			}

		}
		else {

		}

	}

}
