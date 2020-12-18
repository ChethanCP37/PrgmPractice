package JavaPrgms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// Using Bufferedreader
		FileReader fr = new FileReader("src/test/java/JavaPrgms/Test");
		BufferedReader br= new BufferedReader(fr);
		String st=null;
		while((st=br.readLine())!=null) {
			System.out.println(st);
		}

		System.out.println("Using FileReader\n");
		// Using FileReader
		FileReader fr1 = new FileReader("src/test/java/JavaPrgms/Test");
		int ch=0;
		while((ch=fr1.read())!=-1) {
			char c=(char) ch;
			System.out.print(c);
		}

		System.out.println("\n -------In reverse order------");
		FileReader frev = new FileReader("src/test/java/JavaPrgms/Test");
		BufferedReader br1= new BufferedReader(frev);
		List<String> arr= new ArrayList<String>();
		String str=null;
		while((str=br1.readLine())!=null) {
			arr.add(str);
		}
//		System.out.println(arr);
		for(int i=arr.size()-1;i>=0;i--) {
			System.out.println(arr.get(i));
		}
		
		
		
	}





}
