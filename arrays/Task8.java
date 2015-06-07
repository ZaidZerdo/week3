package arrays;

import java.util.Arrays;

public class Task8 {

	/*
	 * Iskodirati program gdje vi, a ne korisnik, napravite dva niza tipa int, proizvoljne veličine,
	 * sa unesenim vrijednostima od 0 do 9, tj. samo cifre. Napraviti treći niz, sabrati dva niza i 
	 * staviti ga u treći niz.
	 * Primjer: niz1 = {9, 5, 2, 3}, dok je niz2 = {4, 8, 7}. Kada se saberu dobit će se treći niz 
	 * koji će imati elemente 1, 0, 0, 1, 0.
	 */
	public static void main(String[] args) {
		int[] array1 = {9, 5, 2, 3};
		int[] array2 = {4, 8, 7};
		
		int num1 = 0;
		for (int i = 0; i < array1.length; i++) {
			num1 = num1 * 10 + array1[i];
		}
		
		int num2 = 0;
		for (int i = 0; i < array2.length; i++) {
			num2 = num2 * 10 + array2[i];
		}
		
		String result = "" + (num1 + num2);
		int[] array3 = new int[result.length()];
		for (int i = 0; i < array3.length; i++) {
			array3[i] = Integer.parseInt(result.charAt(i) + "");
		}
		
		System.out.println(Arrays.toString(array3));
	}

}
