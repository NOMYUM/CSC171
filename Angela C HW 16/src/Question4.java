import java.util.Scanner;

public class Question4 {
	
	public static void main(String[] args) {

		System.out.println("ENTER A NUMBER");

		Scanner sad = new Scanner(System.in);
		int n = sad.nextInt();
		System.out.println(fibonacci(n));

		sad.close();
	}

	public static String fibonacci(int n) {
		String s = "";
		
		if(n==0) {
			s = s+"0";
			return s;
		}
		if(n == 1){ 
			s = s+"01";
			return s;
		} 
		return fibonacci(n-1) + fibonacci(n -2); 
	}
}