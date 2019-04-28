import java.util.Scanner;

public class Question3 {
	
	public static void comp() {
		Scanner sad = new Scanner(System.in);
		boolean num = false ;
	
		do{ 	
			System.out.println("ENTER A NUMBER!");
			try {
				String a = sad.nextLine();
				int x = Integer.parseInt(a);
				System.out.println(x);
				num = false;
			} catch (Exception e) {
				System.out.println("ERROR! EXCEPTION!");
				System.out.println("");
				num = true;
			} 
		}while(num);	
		sad.close();
	} 
	 
	public static void main(String[] args) {
		comp();
	}
}