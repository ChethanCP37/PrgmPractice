package JavaPrgms;

import java.util.Scanner;

public class ArmtrongNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int val = sc.nextInt();
		int num=val; //This step is important 
		int sum = 0;
		
		while(num!=0) {
			int r=num%10;
			sum=sum+r*r*r;
			num=num/10;
			
		}
		if(val==sum) { // here we shouldn't use num==sum as num is already zero in while loop
			System.out.println("Number is ARMSTRONG");
		}
		else {
			System.out.println("Number is Not a ARMSTRONG");
		}
	}
}
