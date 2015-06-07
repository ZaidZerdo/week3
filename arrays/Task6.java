package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {

	/*
	 * Napraviti program koji od korisnika traži da unese dužinu niza N. Zatim će korisnik unijeti 
	 * broj unosa K. U sljedećih K linija korisnik će unositi po dva broja. Prvi broj označava 
	 * indeks a drugi broj označava vrijednost koja će se staviti na taj indeks.
	 * Napravite svoj program maksimalno siguran tako što svaki mogući Exception
	 * sanirate, npr. korisnik unese String umjesto broja ili ako unese loš indeks.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		int k = 0;
		int[] array = null;
		
		try {
			n = input.nextInt();
			array = new int[n];
			
			k = input.nextInt();
		} catch (NumberFormatException ex) {
			System.out.println("Please enter a number!");
			System.exit(0);
		} catch (NegativeArraySizeException ex) {
			System.out.println("Negative array size!");
			System.exit(0);
		}
		
		for (int i = 0; i < k; i++) {
			try {
				int index = input.nextInt();
				int value = input.nextInt();
				
				array[index] = value;
			} catch (NumberFormatException ex) {
				System.out.println("Please enter a number!");
				i--;
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Please enter a valid index!");
				i--;
			}
		}
		input.close();
		
		System.out.println(Arrays.toString(array));
	}

}
