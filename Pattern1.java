import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);
		// Get the number of rows from the user
		System.out.println("Enter the number of rows to print the pattern ");
		int rows = scanner.nextInt();
		System.out.println("**Printing the pattern...**");
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + "");
			}
			System.out.println();
		}
	}
}

/**
 * Pattern 1: Membuat Segitiga Miring
 * Diberikan n menunjukkan berapa banyak lapis yang akan dibentuk.
 * Setiap lapis terdiri dari konten => angka yang akan bertambah satu disampingnya
 * Jumlah lapis = jumlah item. 
 * 
 * Contoh n = 5:
 * Lapis 1: maka jumlah itemnya sebanyak 1 item dengan kontennya = 1
 * Lapis 2: maka jumlah itemnya sebanyak 2 item dengan kontennya = 1 2
 * Lapis 3: maka jumlah itemnya sebanyak 3 item dengan kontennya = 1 2 3
 * Lapis 4: maka jumlah itemnya sebanyak 4 item dengan kontennya = 1 2 3 4
 * Lapis 5: maka jumlah itemnya sebanyak 5 item dengan kontennya = 1 2 3 4 5 
 * 
 * Hasil pattern yang terbentuk dari n = 5:
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4 
 * 1 2 3 4 5
 */


