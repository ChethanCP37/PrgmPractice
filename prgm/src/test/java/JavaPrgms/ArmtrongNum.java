package JavaPrgms;

import java.util.Scanner;

public class ArmtrongNum {

	public static void main(String[] args) {
//		Armstrong Number in Java: A positive number is called armstrong number if it is equal to 
//		the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
		
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
