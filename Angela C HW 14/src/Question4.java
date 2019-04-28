
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Scanner sad = new Scanner(System.in);
		System.out.println("TYPE IN 'next' WHEN DONE ADDING INTEGER TO YOUR LIST");
		System.out.println("ADD A INTEGER YOUR YOR LIST AND THEN HIT ENTER");

		String a = sad.nextLine();

		while (!a.equalsIgnoreCase("next")) {
			list.add(a);
			a = sad.nextLine();
		}
		
		System.out.println("");
		System.out.println("ENTER TWO INTEGERS TO SEE WHETHER THE ELEMENTS AT THE TWO INDEXES IN THE LIST ARE EQUAL");
		int x = sad.nextInt();
		int y = sad.nextInt();
		compare(list, x, y);

		sad.close();
	}

	public static boolean compare(List<String> list, int x, int y) {
		if (list.get(x).equals(list.get(y))) {
			System.out.println("index " + x + " equals " + "index " + y);
		} else {
			System.out.println("index " + x + " does not equal " + "index " + y);
		}
		return false;
	}

	public static void printList(List<String> s) {
		for (int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i) + " ");
		}
	}

}