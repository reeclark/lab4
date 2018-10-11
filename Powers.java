package lab4;

import java.util.Scanner;

public class Powers {
	public static void main(String[] args) {
		// Declare variables.
		Scanner scanner = new Scanner(System.in);
		int number, i = 0;
		int[][] table = new int[2][3];
		String cont = "";

		// Get user input.
		do {
			System.out.println("Enter an integer:");
			number = scanner.nextInt();

			// Print each number inputed.
			//System.out.println("Number" + '\n' + "======");
			System.out.printf("%1$-30s/n", "%2$10s/n", "%3$10.2s/n", "Number", "Squared", "Cubed");
			//System.out.println("Number" + "            Squared " + "           Cubed");
			//2System.out.println("======" + "            ======"  + "             ======");
			
			i = 1;
			while (i <= number) {
				//add printf or some formatting here
				System.out.println(i + "                 " + (i * i) + "                  " + (i * i * i));

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