package arrays;

import java.util.Scanner;

public class Task2 {

	/*
	 * Napraviti program u kojem se korisnik preko konzole pita koliko će dug niz biti. Zatim 
	 * napraviti taj niz i pitati korisnika da unese sve te vrijednosti. Isprintati taj niz na ekran.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		input.close();
		
		for (int val : array) {
			System.out.println(val);
		}		
	}

}
