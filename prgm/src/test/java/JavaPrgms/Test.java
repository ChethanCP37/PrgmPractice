package JavaPrgms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List l= new ArrayList();
		System.out.println(l.size());
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		System.out.println(l);
		l.add(0,122);
		System.out.println(l);
		l.remove(0);
		System.out.println(l);
		
		List ll= new LinkedList();
		

	}

}
