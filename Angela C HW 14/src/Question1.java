/* Name: Angela Chung
 * NetID: 30612068
 * Assignment Number: 12
 * Lab section day/time: MW 2:00-3:15PM
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		Scanner sad = new Scanner(System.in);
		System.out.println("TYPE IN A NUMBER and PRESS ENTER  ");

		int n = sad.nextInt();

		do {
			System.out.println("KEEP ON ENTERING NUMBERS AND WHEN FINISHED ENTER 0");
			ints.add(n);
			n = sad.nextInt();
		} while (n != 0);

		sad.close();
		printList(ints);
	}

	public static void printList(List<Integer> list) {
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}