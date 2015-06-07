package week3.methods;

import java.util.Scanner;

import week3.eow3.TextIO;

public class Tasks {

	/*
	 * Zadnji zadatak.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String R = input.nextLine();
		String F = input.nextLine();
		String S = input.nextLine();
		int B = input.nextInt();
		input.close();
		
		R = fixSentence(R);
		
		if (getExtension(F) == null) {
			F = F + ".txt";
		}
		
		String type = getType(S);
		if (type.equals("boolean")) {
			TextIO.writeFile(F);
			if (canBeBinary(B + "") == true) {
				TextIO.put(B);
			} else {
				TextIO.put(getRandomNumber(B/2, B));
			}
		} else if (type.equals("int")) {
			TextIO.writeFile(F);
			if (canBeBinary(B + "") == true) {
				TextIO.put(B);
			} else {
				TextIO.put(getMax(B, Integer.parseInt(S)));
			}
		} else if (type.equals("String")) {
			TextIO.writeFile(F);
			int P = getRandomNumber(1, B);
			for (int i = 0; i < P; i++) {
				TextIO.putln(S);
			}
			
			TextIO.writeFile(S);
			TextIO.putln(R);
		}
	}

	
	/*
	 * Napisati metodu koja određuje koji je veći broj od data dva.
	 */
	public static int getMax(int num1, int num2) {
		return (num1 > num2)? num1 : num2;
	}
	
	/*
	 * Napisati metodu koja prima jedan String, koji predstavlja puni naziv jednog file-a. 
	 * Odrediti koja je ekstenzija tog file-a. Bonus: Neka vrati null ukoliko nema ekstenzije.
	 */
	public static String getExtension(String filename) {
		int index = filename.indexOf(".");
		
		if (index != -1) {
			return filename.substring(index);
		} else {
			return null;
		}
	}
	
	/*
	 * Napisati metodu koja prima jedan broj i određuje da li dati broj može biti binarni broj, tj. 
	 * sadrži samo jedinice i nule. Bonus: Rješenje bez if i petlji! Koristi try/catch block.
	 */
	public static boolean canBeBinary(String num) {
		try {
			Integer.parseInt(num, 2);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}
	
	/*
	 * Napisati metodu koja prima dva parametra, koja određuju opseg, i neka metoda vrati
	 * nasumično generisan broj koji odgovara tom opsegu. Ukoliko nema brojeva u opsegu onda 
     * vraćati samo −1.
	 */
	public static int getRandomNumber(int min, int max) {
		if (min > max) {
			return -1;
		} else {
			return (int) (Math.random() * (max - min + 1)) + min;
		}
	}
	
	/*
	 * Napisati metodu koja prima jedan String, koji može imati raznije vrijednosti. Prvo 
	 * provjeriti šta sadrži taj String i onda vratiti String koji predstavlja ime najprirodnijeg tipa 
	 * te vrijednosti, tj. da li je boolean, int, double, char ili String.
	 */
	public static String getType(String value) {
		if (value.equalsIgnoreCase("true") || value.equalsIgnoreCase("false")) {
			return "boolean";
		}
		
		if (value.length() == 1) {
			return "char";
		}
		
		try {
			Integer.parseInt(value);
			return "int";
		} catch (NumberFormatException ex) {
			
		}
		
		try {
			Double.parseDouble(value);
			return "double";
		} catch (NumberFormatException ex) {
			
		}
		
		return "String";
	}
	
	/*
	 * Napisati metodu koja prima jedan String, koji predstavlja jednu rečenicu. Potrebno je vratiti 
	 * String, ali sa par popravljenih pravopisnih grešaka. Greške u pitanju su da prvo slovo nije 
	 * početno i da na kraju rečenice nema tačke (zanemariti ostale interpunkcijske znakove).
	 */
	public static String fixSentence(String sentence) {
		if (sentence.charAt(sentence.length() - 1) != '.') {
			sentence += '.';
		}
		
		sentence = sentence.toUpperCase().charAt(0) + sentence.substring(1);
		
		return sentence;
	}
	
	
}
