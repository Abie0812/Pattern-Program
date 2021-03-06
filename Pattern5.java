import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);
		// Get the number of rows from the user
		System.out.println("Enter the number of rows to print the pattern: ");
		int rows = scanner.nextInt();
		System.out.println("**Printing the pattern...**");
		for(int i = rows; i >= 1; i--) {
			for(int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for(int i = 1; i <= rows; i++) {
			for(int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

/**
 * Hasil pattern yang terbentuk dari n = 5:
 * 5 4 3 2 1 
 * 4 3 2 1
 * 3 2 1 
 * 2 1
 * 1
 * 1 
 * 2 1
 * 3 2 1
 * 4 3 2 1
 * 5 4 3 2 1
 */