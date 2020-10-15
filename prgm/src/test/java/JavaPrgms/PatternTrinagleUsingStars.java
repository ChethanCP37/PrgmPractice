package JavaPrgms;

public class PatternTrinagleUsingStars {

	public static void main(String[] args) {
		/* *
		 * ***
		 * *****
		 * *******
		 * *********
		 */
		int p=0;
		for(int i=0;i<6;i++) {
			p++;
			for(int j=0;j<i+p;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
