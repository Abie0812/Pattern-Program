import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);
		// Get the number of rows from the user
		System.out.println("Enter the number of rows to print the pattern: ");
		int rows = scanner.nextInt();
		System.out.println("**Printing the pattern...**");
		for(int i = 1; i <= rows; i++) {
			for(int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}		
	}
}

/**
 * Hasil pattern dari n = 5:
 *     1
 *    1 2
 *   1 2 3
 *  1 2 3 4  
 * 1 2 3 4 5         
 * */

