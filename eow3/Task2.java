package week3.eow3;

public class Task2 {

	/*
	 * Napisati metodu koja prima tri String-a i vraća String koji dođe prvi po abecedi, 
	 * ne obraćajući toliko pažnju na velika i mala slova. Koristiti compareTo metodu!
	 */
	public static void main(String[] args) {
		System.out.println(getFirst("Bit", "Camp", "Java"));
	}

	public static String getFirst(String s1, String s2, String s3) {
		int com12 = s1.compareTo(s2);
		int com13 = s1.compareTo(s3);
		int com23 = s2.compareTo(s3);
		
		if (com12 < 0 && com13 < 0) {
			return s1;
		} else if (com12 < 0 && com23 < 0) {
			return s2;
		} else {
			return s3;
		}
	}
}
