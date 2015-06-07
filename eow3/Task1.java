package week3.eow3;

public class Task1 {
	
	/*
	 * Napisati metodu koja spaja dva data String-a na sljedeÄ‡i naÄ?in: 
	 * Prvi String staviti u sredinu drugog Stringa. Koristiti concat i substring metode! 
	 */
	public static void main(String[] args) {
		System.out.println(merge("Java", "Srce"));
	}
	
	public static String merge(String s1, String s2) {
		String part1 = s2.substring(0, s2.length() / 2);
		String part3 = s2.substring(s2.length() / 2);
		String part12 = part1.concat(s1);
		return part12.concat(part3);
	}

}
