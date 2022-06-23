package Basic_Java_Pgms;
import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int head_Count = 0;
		int tail_Count = 0;
		double heads_Percent;
		double tails_Percent;
		int number_Of_Flips;
		System.out.println("Enter the no of times coin filps");
		number_Of_Flips = sc.nextInt();
		for (int i = 0; i <= number_Of_Flips; i++) {
			double random = Math.random();
			if (random < 0.5)

				head_Count++;
			else
				tail_Count++;

		}
		heads_Percent = head_Count / (double) number_Of_Flips * 100;
		System.out.println("Percentage of Head is " + heads_Percent);

		tails_Percent = tail_Count / (double) number_Of_Flips * 100;
		System.out.println("Percentage of Tails is" + tails_Percent);

	}

}
