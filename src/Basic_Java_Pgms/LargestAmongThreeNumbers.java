package Basic_Java_Pgms;

import java.util.Scanner;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number:");
		int first=sc.nextInt();
		
		System.out.print("Enter Second Number:");
		int second=sc.nextInt();
		
		System.out.print("Enter Three Number:");
		int three=sc.nextInt();
		
		if((first>second && first>three))
		{
			System.out.print(first +" " + " is largest among others");
		}
		else if(second>first && second>three)
		{
			System.out.print(second +" "+ "is largest among others");
		}
		else
		{
			System.out.print(three +" "+ "is largest among others");
		}

	}

}
