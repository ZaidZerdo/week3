package week3.eow3;

import java.util.Arrays;

public class Task6 {

	/*
	 * Napisati metodu koja prima jedan cijeli broj N i M. 
	 * Iz metode vratiti niz dužine 10, i ispunjen brojevima M od indeksa N. 
	 * Pored toga, metoda mora throw-ati exception ako indeks ne valja.
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getArray(5, 8)));
	}

	public static int[] getArray(int n, int m) {
		int[] array = new int[10];
		
		if (n < 0 || n > 9) {
			throw new IndexOutOfBoundsException();
		}
		
		for (int i = n; i < array.length; i++) {
			array[i] = m;
		}
		
		return array;
	}
}
