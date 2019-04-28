import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner sad = new Scanner(System.in);
		System.out.println("TYPE IN '0 0' WHEN YOU ARE DONE");
		System.out.println("TYPE IN A NAME THEN PRESS ENTER AND PHONENUBER THEN PRESS ENTER");
		String a = sad.next();
		
		int x = sad.nextInt();
		while (!a.equalsIgnoreCase("0")&& x!=0) {
			map.put(a, x);
			
			System.out.println("");
			System.out.println("TYPE IN A NAME THEN PRESS ENTER AND PHONENUBER THEN PRESS ENTER");
			a = sad.next();
			x = sad.nextInt();
		}

		System.out.println("TO SEARCH A PHONENUMBER, TYPE IN A NAME THEN PRESS ENTER");
		String b = sad.next();

		if (map.containsKey(b)) {
			System.out.println(b + "'s phone number is " + map.get(b));
		} else {
			System.out.println(b + " does not exist");
		}

		sad.close();
	};
}