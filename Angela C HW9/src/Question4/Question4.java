package Question4;

public class Question4 {
	public static void main(String []args) {
		bankaccounts.account one = new bankaccounts.account(" Bob", " 6543456787654356.");
		computeruseraccounts.account two = new computeruseraccounts.account(" Samantha", " 3456765434567." );

		System.out.println(one.toString());
		System.out.println(two.toString());
	}
}