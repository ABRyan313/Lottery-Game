package lotteryGame;

import java.util.*;

public class Lottery {

	public static void main(String[] args) {

		ArrayList<Integer> winningNumbers = new ArrayList<>();
		Random rand = new Random();

		for (int i = 0; i < 6; i++) {
			while (true) {
				int winningnum = rand.nextInt(49) + 1;
				if (!winningNumbers.contains(winningnum))
					winningNumbers.add(winningnum);
				break;
			}
		}

		System.out.println(winningNumbers);

		System.out.println("Enter six numbers between 1 to 49(inclusive)");
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> GuessedNumbers = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			

			while (true) {
				try {
					String numberString = sc.nextLine();
					int number = Integer.parseInt(numberString);
					if (number >= 1 && number <= 49) {
						GuessedNumbers.add(number);
						break;
					}

					else {
						System.out.println("Try Again");
					}
				} catch (Exception E) {
					System.out.println("Enter a number");
				}

			}
		}
		
		System.out.println("The winning numbers are:" + winningNumbers);
		System.out.println("Your numbers are:" + GuessedNumbers);
		
		GuessedNumbers.retainAll(winningNumbers);
		System.out.println("Matched numbers are:"  + GuessedNumbers);

		if(GuessedNumbers.containsAll(winningNumbers)) {
			System.out.println("You won");
		}
		else {
			System.out.println("You Lost");
		}
			
	}

}
