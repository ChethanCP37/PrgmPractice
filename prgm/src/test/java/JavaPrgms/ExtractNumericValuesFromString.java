package JavaPrgms;

public class ExtractNumericValuesFromString {

	public static void main(String[] args) {
		String str="Struggle12for5andind829";
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				System.out.print(str.charAt(i)+",");
			}
		}
	}
}
