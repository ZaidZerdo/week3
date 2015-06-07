package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {

	/*
	 * Konstruisati program u kojem korisnik unese dužinu niza, a i elemente toga niza. Svi 
	 * elementi su tipa int i moraju biti u opsegu 0 – 9. Ukoliko nisu, ispisati grešku i tražiti od 
	 * korisnika da ponovo unese broj za taj isti indeks. Nakon toga, ispisati na ekran koliko se 
	 * koja cifra ponavlja u tom nizu, npr. „Cifra 0 se pojavila 2 puta, 1 se pojavila 0 puta, ...“.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];		
		int[] counter = new int[10];
		
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
			
			if (array[i] < 0 || array[i] > 9) {
				System.out.println("Please enter a number between 0 and 9!");
				i--;
			} else {
				counter[array[i]]++;
			}
		}
		input.close();
		
		System.out.println(Arrays.toString(counter));		
	}

}
