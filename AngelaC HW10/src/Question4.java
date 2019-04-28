import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Question4 extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		int height = getHeight();
		g.setColor(Color.black);
		int x = 0;
		int y = height;
		for(int t=0; t< 1400 ; t = t+20  ) {
			g.drawLine(0, t, x, y);
			x = x+ 22;
		}
	}
	
	public static void main(String[] args) {
		Question4 canvas = new Question4();
		JFrame frame = new JFrame("Basic Lines");
		
		frame.add(canvas);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1400, 1400);
		frame.setVisible(true);
	}
}