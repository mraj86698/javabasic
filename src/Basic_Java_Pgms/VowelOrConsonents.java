package Basic_Java_Pgms;

import java.util.Scanner;

public class VowelOrConsonents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a charater");
		char ch = sc.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is a Vowels");

		} else {
			System.out.println(ch + " is a Consonents");
		}
	}

}
