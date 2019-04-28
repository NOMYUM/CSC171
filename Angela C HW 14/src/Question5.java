import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question5 {

	public static void main(String[] args) {
		System.out.println("TYPE IN A NAME AND PRESS ENTER ");
		System.out.println("TYPE IN 'next' WHEN DONE ENTERING NAMES");
		Set<String> set = new HashSet<String>();
		Scanner sad = new Scanner(System.in);
		String n = sad.nextLine();

		while (!n.equalsIgnoreCase("next")) {
			set.add(n);
			n = sad.nextLine();
		}

		System.out.println("");
		System.out.println("TYPE IN A NAME TO SEE IF IT'S IN THE SET");
		String a = sad.nextLine();
		if (set.contains(a)) {
			System.out.println(a + " is in the set");
		} else {
			System.out.println(a + " is not in the set");
		}

		sad.close();
	}
}