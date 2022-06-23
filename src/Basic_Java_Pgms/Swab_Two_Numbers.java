package Basic_Java_Pgms;

import java.util.Scanner;

public class Swab_Two_Numbers {

	public static void main(String[] args) {
		int swap=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a=sc.nextInt();
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
		System.out.println("before swaping number is " +a+" " +b);
			swap=a;
			a=b;
			b=swap;
		System.out.println("After swaping the number is " +a +" " + b);

	}

}
