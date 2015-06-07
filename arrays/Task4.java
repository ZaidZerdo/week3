package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	/*
	 * Konstruisati program gdje se korisnik pita da unese jedan String. Napraviti niz 
	 * karaktera jednak dužini tog niza i svaki karakter staviti na jedno mjesto u nizu. Zatim je 
	 * potrebno obrnuti taj niz i isprintati ga (ne prihvaćam da ga odmah isprintate obrnuto, 
	 * nego da prvo obrnete pa onda isprintate).
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		input.close();
		
		char[] array = new char[s.length()];
		for (int i = s.length() - 1; i >= 0; i--) {
			array[i] = s.charAt(s.length() - i - 1);
		}
		
		System.out.println(Arrays.toString(array));
	}

}
