package JavaPrgms;

public class ReadFilePathFromLast {
	public static void main(String[] args) {
		String filePath="/src/abc/test/xyz/demo.doc";	
		String str[]=filePath.split("/");

		for(int i=str.length-1;i>=0;i--) {
			String res=str[i];
			String revUrl ="";
			if(res.length()>0) {
				revUrl="/"+res;
			}
			System.out.print(revUrl);
		}
	}
}
