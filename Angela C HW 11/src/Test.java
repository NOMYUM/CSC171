import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		JFrame frame = new JFrame();
		
		frame.setSize(300, 300);
		frame.add(canvas);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
