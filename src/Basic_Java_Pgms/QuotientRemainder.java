package Basic_Java_Pgms;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int quotient;
		int remainder;
		int result;
		System.out.print("Enter the Numerator");
		int numerator=sc.nextInt();
		System.out.print("Enter the  Denominator");
		int denominator=sc.nextInt();
		remainder=numerator % denominator;
		System.out.println("display remainder value" +" " + remainder );
		quotient=numerator / denominator;
		System.out.println("display quotient"  + " "+ quotient);
	}

}
