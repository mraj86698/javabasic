package Basic_Java_Pgms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int number=sc.nextInt();
		if(number%2==0)
		{
			System.out.println("The number is Even");
		}
		else
		{
			System.out.println("The number is Odd");
		}

	}

}
