import java.util.Scanner;

public class Question2 {

	public static void main(String args[]) {

		System.out.println("ENTER A NUMBER: ");
		Scanner sad = new Scanner(System.in);
		int pali = sad.nextInt();

		if (Palindrome(pali)) {
			System.out.println("");
			System.out.println(pali + " is a palindrome");
		} else {
			System.out.println("");
			System.out.println(pali + " is not a palindrome");
		}

		sad.close();
	}

	public static boolean Palindrome(int n) {
		int pali = n;
		int reverse = 0;

		while (pali != 0) {
			int remain = pali % 10;
			reverse = reverse * 10 + remain;
			pali = pali / 10;
		}
		if (n == reverse) {
			return true;
		}
		return false;
	}
}