package JavaPrgms;

public class ReverseInteger {
	static int i=243;
	static int rev=0;

	public static void main(String[] args) {
		int res=i+rev;
		reverse();
		System.out.println(rev);
	}
	public static void reverse() {
		while(i!=0) {
			int digit=i%10;
			rev=rev*10+digit;
			i=i/10;
		}
	}

}
