package JavaPrgms;

public class ReverseStringWithoutSpecialChars {

	public static void main(String[] args) {
		String str= "Ch$e*th@a&!n@c%$";
		char ch[]= str.toCharArray();
		int len= str.length()-1;
		int a=0;
		while(len>a) {
			if(!Character.isAlphabetic(ch[len])) {
				len--;
			}
			else if(!Character.isAlphabetic(ch[a])) {
				a++;
			}
			else {
				char temp=ch[len];
				ch[len]=ch[a];
				ch[a]=temp;
				len--;
				a++;
			}
		}
		System.out.println(ch);

	}
} 



