import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);
		// Get the number of rows from the user
		System.out.println("Enter the number of rows to print the pattern ");
		int rows = scanner.nextInt();
		System.out.println("**Printing the pattern...**");
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for(int i = rows; i >= 1; i--) {
			for(int j = 1; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

/**
 * Pattern 3: Membuat Setengah Diamond
 * Diberikan n menunjukkan posisi lapis ke-n akan berapa di tengah semua lapisan yang ada.
 * Setiap lapis kontennya terdiri dari => angka yang dimulai dari 1 untuk kemudian berikutnya ditambah 1.
 * 
 * Akan terdapat 2 loop:
 * Loop 1 untuk membentuk pattern dari lapis 1 - 5   
 * Loop 2 untuk membentuk pattern dari lapis 6 - 9
 * Loop 1 dengan Loop 2 adalah sama-sama looping sebanyak n, 
 * namun yang membedakan adalah kondisi setelah masuk dalam loop 1 ataupun loop 2
 * 
 * Contoh n = 5: 
 * Loop 1: akan looping sebanyak 5x
 * Loop 2: akan looping sebanyak 5x juga cuma disini di loop ke-5 atau 
 *         loop terakhir ini akan dibuat kondisi berbeda dari Loop 1
 * 
 * Lapis ke-1: maka jumlah itemnya sebanyak 1 item dengan kontennya = 1
 * Lapis ke-2: maka jumlah itemnya sebanyak 2 item dengan kontennya = 1 2
 * Lapis ke-3: maka jumlah itemnya sebanyak 3 item dengan kontennya = 1 2 3
 * Lapis ke-4: maka jumlah itemnya sebanyak 4 item dengan kontennya = 1 2 3 4
 * Lapis ke-5: maka jumlah itemnya sebanyak 5 item dengan kontennya = 1 2 3 4 5
 * Lapis ke-6: maka jumlah itemnya sebanyak 4 item dengan kontennya = 1 2 3 4
 * Lapis ke-7: maka jumlah itemnya sebanyak 3 item dengan kontennya = 1 2 3 
 * Lapis ke-8: maka jumlah itemnya sebanyak 2 item dengan kontennya = 1 2
 * Lapis ke-9: maka jumlah itemnya sebanyak 1 item dengan kontennya = 1
 * 
 * Hasil dari pattern yang terbentuk dari n = 5:
 * 1
 * 1 2 
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2 
 * 1
 * */
