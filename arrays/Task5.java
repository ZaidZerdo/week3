package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
	
	/*
	 * Napisati program gdje vi, a ne korisnik, napravite jedan niz proizvoljne veličine i popunite
	 * ga sa proizvoljnim int vrijednostima. Napravite drugi, duplo veći, niz i popunite prvih 
	 * pola indeksa sa vrijednostima prvoga niza. Ostatak niza će biti ispunjen nulama. Tako 
	 * ste, zapravo, uradili „povećanje“ niza.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		input.close();
		
		int[] array2 = new int[2 * n];
		for (int i = 0; i < n; i++) {
			array2[i] = array[i];
		}
		
		System.out.println(Arrays.toString(array2));
	}
}
