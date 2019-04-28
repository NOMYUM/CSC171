import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question4 {
	
	public static void comp() {
		List<Object> object = new ArrayList<>();
		Scanner sad = new Scanner(System.in);
		Scanner sadder = new Scanner(System.in);
		
		System.out.println("ENTER THE LENGTH OF THE LIST");
		Object a = null; 
		int x =  sad.nextInt();
		
		for (int i=0; i<x;i++){ 
			System.out.println("ADD INTEGER(S) TO THE LIST");
			a = sadder.next();
			object.add(a);
		}
		
		System.out.println("ENTER AN NUMBER TO SEARCH");
		int i = sad.nextInt();
		
		try {
			System.out.println(object.get(i));
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("ERROR! INDEXOUTOFBOUNDS!");
		}
		sad.close();
		sadder.close();
	}
	
		public static void main(String[] args) {
			comp();
		}
	
}
