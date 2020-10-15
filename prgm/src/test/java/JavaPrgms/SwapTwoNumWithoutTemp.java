package JavaPrgms;

public class SwapTwoNumWithoutTemp {

	public static void main(String[] args) {
		int a=36;
		int b=24;
		System.out.println("Before swap a and b are "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swap a and b are "+a+" "+b);

	}

}
