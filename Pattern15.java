import java.util.Scanner;

public class Pattern15 {
	public static void main(String[] args) {
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);
		// Get the number of rows from the user
		System.out.println("Enter the number of rows to print the pattern: ");
		int rows = scanner.nextInt();
		System.out.println("**Printing the pattern...**");
		for(int i = rows; i >= 1; i--) {
			for(int j = 1; j > i; j++) {
				System.out.println(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}

/**
 * Hasil dari pattern yang terbentuk dari n = 5:
 * 1 2 3 4 5
 *  1 2 3 4 
 *   1 2 3 
 *    1 2 
 *     1
 * */
