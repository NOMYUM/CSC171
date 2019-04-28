
public class Question7<E> {
	protected class Node {
		public Object data;
		public Node next;
		public Node previous;

		public Node(Object data) {
			this.data = data;
		}
	}

	protected Node first;
	protected Node last;

	public void prepend(Object e) {
		Node no = new Node(e);
		if (first != null) {
			first.previous = no;
		}

		no.next = first;
		first = no;
		if (last == null) {
			last = no;
		}
	}

	// question 6
	int indexOf(Object e) {
		Node nope = first;
		boolean found = false;
		int count = 0;
		while (nope != null) {
			if (nope.data.equals(e)) {
				found = true;
				break;

			} else {
				nope = nope.next;
				count++;
			}
		}

		if (found == false) {
			return -1;
		} else {
			return count;
		}
	}
	
	//question7
	public Object get(int i) {
		int count = 0;
		Node node = first;

		try {
			for (node = first; node != null; node = node.next) {
				if (i == count) {
					return node.data;
				}
				count++;
			}
			return node.next;
		} catch (IndexOutOfBoundsException e) {
			return count;
		}
	}

	public String toString() {
		String result = "[";
		for (Node never = first; never != null; never = never.next) {
			result += never.data;
			if (never.next != null) {
				result += ",";
			}
		}

		result += "]";
		return result;
	}

	public static void main(String[] args) {
		Question7<Object> test = new Question7<Object>();
		test.prepend(new Integer(500));
		System.out.println(test);
	}
}
