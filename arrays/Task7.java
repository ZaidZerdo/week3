package arrays;

import java.util.Arrays;

public class Task7 {

	/*
	 * Napraviti program gdje vi, a ne korisnik, napravite dva niza, proizvoljne dužine, i odmah
	 * unesete vrijednosti (npr. int[] array1 = {1, 5, 2, 3}). Napravite treći niz sa 
	 * dovoljnom veličinom da može prihvatiti i prvi i drugi niz. Stavite prvi, zatim i drugi niz, u 
	 * taj novi niz i isprintati taj treći niz na konzolu.
	 */
	public static void main(String[] args) {
		int[] array1 = {1, 5, 2, 3};
		int[] array2 = {1, 2, 8};
		
		int[] array3 = new int[array1.length + array2.length];
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			array3[array1.length + i] = array2[i];
		}
		
		System.out.println(Arrays.toString(array3));
	}

}
