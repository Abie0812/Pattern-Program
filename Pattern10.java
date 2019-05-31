import java.util.Scanner;

public class Pattern10 {
	public static void main(String[] args) {
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);
		// Get the number of rows from the user
		System.out.println("Enter the number of rows to print the pattern: ");
		int rows = scanner.nextInt();
		System.out.println("**Printing the pattern...**");
		int k = 1;
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}		
	}
}

/**
 * Hasil pattern yang terbentuk dari n = 5:
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 * */
