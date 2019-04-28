import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Question6 extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		int xPoint = width / 2;
		int yPoint = height / 2;
		for (int i = 0; i < 13; i++) {
			int r = (int) Math.round(Math.random() * 255);
			int gr = (int) Math.round(Math.random() * 255);
			int b = (int) Math.round(Math.random() * 255);
			Color col = new Color(r, gr, b);
			
			g.drawOval(xPoint - (i * 10), yPoint - (i * 10), (i * 20), (i * 20));
			g.setColor(col);
		}
	}

	public static void main(String[] args) {
		Question6 canvas = new Question6();
		JFrame frame = new JFrame("Basic Lines");
		
		frame.add(canvas);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
}