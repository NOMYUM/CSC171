/* Name: Angela Chung
 * NetID: 30612068
 * Assignment Number: 16
 * Lab section day/time: MW 2:00-3:15PM
 */

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		System.out.println("ENTER TWO NUMBERS");
		
		Scanner sad = new Scanner(System.in);
		int x = sad.nextInt();
		int y = sad.nextInt();
		
		System.out.println("");
		System.out.println(multiply(x, y));

		sad.close();
	}

	public static int multiply(int x, int y) {
		if (y == 0) {
			return 0;
		} else {
			return x + multiply(x, y - 1);
		}
	}
}