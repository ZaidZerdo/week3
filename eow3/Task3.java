package week3.eow3;

public class Task3 {

	/*
	 * Napisati metodu koja prima dva String-a i vraća String koji 
	 * predstavlja nastavak drugog u prvom Stringu. 
	 * Koristiti indexOf i substring metode! 
	 */
	public static void main(String[] args) {
		System.out.println(getTheRest("BitCamp", "itC"));
	}
	
	public static String getTheRest(String s1, String s2) {
		int index = s1.indexOf(s2);
		
		try {
			return s1.substring(index);
		} catch (StringIndexOutOfBoundsException ex) {
			return null;
		}
	}

}
