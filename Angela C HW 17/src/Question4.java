public class Question4 <E> { //question4
	protected Object[] list;

	public Question4() {
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

	// question2
	public String toString() {
		String string = "";
		for (int i = 0; i < list.length; i++) {
			string += list[i];
		}
		return string;
	}

	//question3
	public void prepend(Object e) {
		int length = list.length;
		Object[] newlist = new Object[length + 1];
		for (int i = 0; i < length; i++) {
			newlist[i] = list[i];
		}
		list = newlist;
		list[length] = e;
	}

	public static void main(String[] args) {
		Question4 test = new Question4();
		test.append(1);
		test.append(2);
		test.append(3);
		System.out.println(test.toString());
		test.prepend(6);
		System.out.println(test.toString());
	}
}