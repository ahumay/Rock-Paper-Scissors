import java.util.Scanner;
public class RockPaperScissor2 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("How many rounds have been played: ");
		int x = console.nextInt();
		System.out.println();

		System.out.print("How many rounds did Player 1 win: ");
		int player1 = console.nextInt();
		System.out.print("How many moves did Player 1 do: ");
		int moves1 = console.nextInt();
		System.out.println();

		System.out.print("How many rounds did Player 2 win: ");
		int player2 = console.nextInt();
		System.out.print("How many moves did Player 2 do: ");
		int moves2 = console.nextInt();
		System.out.println();
		if (player1 + player2 == x){



			System.out.println("The percentage of rounds Player 1 won is: " + calculate(player1, x) + " in " + moves1 + " moves");
			System.out.println("The percentage of rounds Player 2 won is: " + calculate(player2, x) + " in " + moves2 + " moves");
			if (calculate(player1, x) > calculate(player2, x)) {
				System.out.println("Player 1 did better than player 2");
			}
			else if (calculate(player2, x) > calculate(player1, x)) {
				System.out.println("Player 2 did better than player 1");
			}
			else if (calculate(player1, x)==calculate(player2, x)) {
				System.out.println("Player 1 and player 2 tied");
				if (moves1 > moves2) {
					System.out.println("But, Player 2 had less moved than player 1. So player 1 won");
				}
				else if (moves2 > moves1) {
					System.out.println("But, Player 1 had less moved than player 2. So player 2 won");
				}
				else {
					System.out.println("They tie in both moves and number of rounds won");
				}
			}
			
		}
		else {
		System.out.println("Too many rounds entered for either player 1 or 2");
		}
	}

	public static double calculate(double k, double j) {
		double percentage = (k/j);
		return percentage; 
	}
}







