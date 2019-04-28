/* Name: Angela Chung
 * NetID: 30612068
 * Assignment Number: 16
 * Lab section day/time: MW 2:00-3:15PM
 */

public class Question1 {
	protected Object[] list;

	public Question1() {
		list = new Object[0];
	}

	public void append(Object e) {
		int length = list.length;
		Object[] newlist = new Object[length + 1];
		for (int i = 0; i < length; i++) {
			newlist[i] = list[i];
		}
		list = newlist;
		list[length] = e;
	}

	public static void main(String[] args) {
		Question1 test = new Question1();
		test.append(1);
		test.append(2);
		test.append(3);
		System.out.println(test.toString());
	}
}