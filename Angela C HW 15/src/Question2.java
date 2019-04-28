
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sad = new Scanner(System.in);
		System.out.println("ENTER NUMBER, STRING, NUMBER ALL IN ONE LINE");
		
		try {
			int x = sad.nextInt();
			String a = sad.next();
			int y = sad.nextInt();
			
			if (a.equals("+")) {
				System.out.println("= " + (x + y));
			} else if (a.equals("-")) {
				System.out.println( "= " + (x - y));
			} else if (a.equals("*")) {
				System.out.println("= " + (x * y));
			} else if (a.equals("/")) {
				System.out.println("= " + (x / y));
			} else if (a.equals("%")) {
				System.out.println("= " +  (x % y));
			} 
		} catch (ArithmeticException e) {
			System.out.println("ERROR! ARITHMETICEXCEPTION!");
		} catch (InputMismatchException e) {
			System.out.println("ERROR! INPUTMISMATCHEXCEPTION!");
		}
		
		sad.close();
	}
}