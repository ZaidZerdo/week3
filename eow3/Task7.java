package week3.eow3;

import java.util.Arrays;

public class Task7 {

	/*
	 * Napisati metodu koja prima jedan cijeli broj N i K. Iz metode vratiti niz dužine N, 
	 * i ispunjen brojevima od 1 do K. Pretpostavite da brojevi N i K će uvijek biti veći od 0.
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getArray2(9, 5)));
	}

	public static int[] getArray2(int n, int k) {
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = i % k + 1;
		}
		
		return array;
	}
}
