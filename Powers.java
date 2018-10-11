package lab4;

import java.util.Scanner;

public class Powers {
	public static void main(String[] args) {
		// Declare variables.
		Scanner scanner = new Scanner(System.in);
		long number, i = 0;
		String cont = "";
		
		do {
			// Get user input.
			System.out.println("Enter an integer:");
			number = scanner.nextInt();

			// Print each number inputed.
			System.out.printf("%-10s %-12s %-14s\n", "Number", "Squared", "Cubed");
			System.out.printf("%-10s %-12s %-14s\n", "======", "======", "======");
			
			i = 1;
			while (i <= number) {
				System.out.printf("%-10d %-12d %-14d\n", i, i * i, i * i * i);

				i = i + 1;
			}
			System.out.println();

			// Ask to continue.
			System.out.println("Continue? (y/n): ");
			scanner.nextLine();
			cont = scanner.nextLine();

		} while (cont.equalsIgnoreCase("y"));
		System.out.println("Bye!");
		scanner.close();
		return;
	}
}

/* Sources:
 * https://learn.zybooks.com/zybook/GRANDCIRCUSJAVAAY2018/chapter/4/section/4
 */