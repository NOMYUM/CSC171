
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Scanner sad = new Scanner(System.in);
		System.out.println("ADD A STRING TO YOUR LIST AND THEN HIT ENTER");
		System.out.println("TO CHECK TO SEE IF THE STRING EXISTS IN THE LIST, TYPE IN 'rice (string)'");

		String a = sad.nextLine();

		while (!a.startsWith("rice")) {
			list.add(a);
			a = sad.nextLine();
		}

		a = a.replace("rice", "");
		
		int  x= 0;
		int y = -1;
		String b ="";
		for (String z : list) {	
			y+=1;
			if ((" " + z).equals(a)) {
				b=b+" "+y;
				x++;
			}
		}

		if (x > 0) {
			System.out.println(a + " is in the list " + x + " times at index " + b);
		
		} else {
			System.out.println(a + " is not in the list");
		}

		sad.close();
	}

	public static void printList(List<String> s) {
		for (int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i) + " ");
		}
	}
}