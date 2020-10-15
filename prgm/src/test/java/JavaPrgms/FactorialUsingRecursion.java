package JavaPrgms;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		int facNum=5;
		int res=factorial(facNum);
		
		System.out.println(res);

	}
	public static int factorial(int facNum) {
		if(facNum==1) {
			return 1;
		}
		
		int data= factorial(facNum-1)*facNum;
		return data;
	}

}
