
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		List<String> s = new ArrayList<>();
		Scanner sad = new Scanner(System.in);
		System.out.println("TYPE IN 'next' WHEN DONE ADDING STRING TO YOUR LIST");
		System.out.println("ADD A STRING YOUR YOR LIST AND THEN HIT ENTER");
		
		String a = sad.nextLine();

		while (!a.equalsIgnoreCase("next")) {
			s.add(a);
			a = sad.nextLine();
		}
		
		System.out.println("");
		System.out.println("ADD ANY STRING TO COMPARE WITH THE EXISTING LIST");
		String b = sad.nextLine();

		int e = 0;

		for (String c : s) {
			if (c.equals(b)) {
				e++;
			}
		}

		if (e > 0) {
			System.out.println(b + " is in the list " + e + " times");
		} else {
			System.out.println(b + " is not in the list");
		}
		
		sad.close();
	}

	public static void printList(List<String> s) {
		for (int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i) + " ");
		}
	}
}