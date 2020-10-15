package JavaPrgms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLineCodeFromFile {

	public static void main(String[] args) throws IOException {
		FileReader fr= new FileReader("src/test/java/JavaPrgms/Test");
		BufferedReader br= new BufferedReader(fr);

		String data=null;
		while((data=br.readLine())!=null) {
			System.out.println(data);
		}
	}

}
