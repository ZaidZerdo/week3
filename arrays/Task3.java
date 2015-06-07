package arrays;

import java.util.Scanner;

public class Task3 {

	/*
	 * Iskodirati program gdje se korisnik pita koliko će brojeva unijeti. Zatim unijeti sve te 
	 * elemente, koji su tipa int, u niz. Na kraju će se korisnik pitati koji broj želi da se prebroji. 
	 * Provjeriti koliko se taj broj pojavljuje u nizu i isprintati na ekran.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		
		int find = input.nextInt();
		input.close();
		
		int counter = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] == find) {
				counter++;
			}
		}
		
		System.out.println(counter);
		
	}

}
