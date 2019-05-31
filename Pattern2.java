import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);
		// Get the number of rows from the user
		System.out.println("Enter the number of rows to print the pattern ");
		int rows = scanner.nextInt();
		System.out.println("**Printing the pattern...**");
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}		
	}
}

/**
 * Pattern 2: Membuat Segitiga Miring
 * Diberikan n menunjukkan berapa banyak lapis yang akan dibentuk.
 * Setiap lapis terdiri dari konten => angka sesuai dengan lapis ke berapa dia berada.
 * Jumlah lapis = jumlah item.
 * 
 * Contoh n = 5:
 * Lapis ke-1: maka jumlah itemnya sebanyak 1 item dengan kontennya = 1
 * Lapis ke-2: maka jumlah itemnya sebanyak 2 item dengan kontennya = 2 2
 * Lapis ke-3: maka jumlah itemnya sebanyak 3 item dengan kontennya = 3 3 3
 * Lapis ke-4: maka jumlah itemnya sebanyak 4 item dengan kontennya = 4 4 4 4
 * Lapis ke-5: maka jumlah itemnya sebanyak 5 item dengan kontennya = 5 5 5 5 5
 * 
 * Hasil dari pattern yang terbentuk dari n = 5:
 * 1 
 * 2 2 
 * 3 3 3 
 * 4 4 4 4 
 * 5 5 5 5 5 
 */