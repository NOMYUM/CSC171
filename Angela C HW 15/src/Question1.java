/* Name: Angela Chung
 * NetID: 30612068
 * Assignment Number: 15
 * Lab section day/time: MW 2:00-3:15PM
 */

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sad = new Scanner(System.in);
		
		try {
			System.out.println("ENTER STRING");
			String a = sad.next();
			int x = Integer.parseInt(a);
			System.out.println(x);
		} catch (NumberFormatException e) {
			System.out.println("");
			System.out.println("INPUT IS NOT THE DECIMAL REPRESENTATION OF A NUMBER");
		}

		sad.close();
	}
}