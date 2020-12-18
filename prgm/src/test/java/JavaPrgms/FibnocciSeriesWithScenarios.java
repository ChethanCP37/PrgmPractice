package JavaPrgms;

import java.util.Scanner;

public class FibnocciSeriesWithScenarios {

	public static void main(String[] args) {
		/*Scenarios: In below, X is the value says number fibnoci digits to print
		 * 1. Should be positive number
		 * 2. Should be an integer
		 * 3. Should not be string
		 * 4. Shouldn't be negative number
		 * 5. should accept more than 2 digits
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter input");
		String str=sc.nextLine();
		double x = 0;
		int num = 0;

		try {
			x=Double.parseDouble(str);
			num= (int)x;
			int fir=0,sec=1,last=0;
			if(x>3) {
				if(num==x) {
					System.out.println(fir);
					for(int i=1;i<x;i++) {
						last=fir+sec;
						fir=sec;
						sec=last;
						System.out.println(last);
					}
				}
				else {
					System.out.println("Number is not an Integer");
				}
			}
			else {
				System.out.println("Number is not greater than 3");
			}
		}
		catch(Exception e) {
			System.out.println("Entered value is not correct and throwing number format exception");
		}


	}

}
