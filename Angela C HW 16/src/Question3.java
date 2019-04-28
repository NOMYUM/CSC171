import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {

		System.out.println("ENTER A NUMBER");

		Scanner sad = new Scanner(System.in);
		int n = sad.nextInt();
		System.out.println(lucas(n));

		sad.close();
	}

	public static int lucas(int n) {
		if (n == 0)
			return 2;
		if (n == 1)
			return 1;
		return lucas(n - 1) + lucas(n - 2);
	}
}
