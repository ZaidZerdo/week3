package week3.eow3;

import java.util.Arrays;

public class Task8 {

	/*
	 * Napisati metodu koja prima jedan String, koji predstavlja ime file-a. 
	 * U�?itati iz tog file-a niz, koristeći TextIO i eof, i vratiti taj niz iz spomenute metode, pri tome obraćajući pažnju na mogući exception koji se može desiti ako traženo file ne postoji. Dobro obratiti pažnju na dužinu niza, jer dužina niza nije precizirana prije unosa elemanata niza. 
	 * Moguće je napraviti jedan niz, određene dužine, 
	 * i onda povećati ga ukoliko bude potrebno. 
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getArray3("src/week3/d1/data.in")));
	}
	
	public static int[] getArray3(String filename) {
		try {
			TextIO.readFile(filename);
		} catch (IllegalArgumentException ex) {
			System.out.println("Could not open file!");
			return null;
		}
		
		int[] array = new int[0]; // Make an empty array
		while (!TextIO.eof()) {
			// Make a temp array that is larger by 1 element
			int[] temp = new int[array.length + 1];
			for (int i = 0; i < array.length; i++) {
				temp[i] = array[i];
			}
			
			// Take in the next element
			try {
				temp[array.length] = Integer.parseInt(TextIO.getln());
			} catch (NumberFormatException ex) {
				System.out.println("File contains non-numerical characters.");
				return null;
			}
			
			array = temp;
		}
		
		return array;
	}

}
