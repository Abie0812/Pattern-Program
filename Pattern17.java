import java.util.Scanner;

public class Pattern17 {
	public static void main(String[] args) {
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);
		// Get the number of rows from the user
		System.out.println("Enter the number of rows to print the pattern: ");
		int rows = scanner.nextInt();
		System.out.println("**Printing the pattern...**");
	}
}

/**
 * Hasil pattern yang terbentuk dari n = 5:
 * 12345
 *  2345
 *   345
 *    45
 *     5
 *     5
 *    45
 *   345
 *  2345
 * 12345
 * */
