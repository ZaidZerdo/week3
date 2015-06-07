package arrays;

public class Task1 {

	/*
	 * Napisati program koji će napraviti niz od deset brojeva. Popuniti taj niz sa random
	 * brojevima od 1 do 10. Isprintati taj niz na ekran preko foreach petlje.
	 */
	public static void main(String[] args) {
		int[] array = new int[10];
		
		for (int i = 0; i < 10; i++) {
			array[i] = (int) (Math.random() * 10) + 1;
		}
		
		for (int val : array) {
			System.out.println(val);
		}
	}

}
