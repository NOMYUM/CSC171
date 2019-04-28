import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Question2 extends JComponent{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		int height = getHeight();
		g.setColor(Color.black);
		int x = 0;
		int y = height;
	    System.out.println(x + " " + y);
	    while(x < 1400 && y > 0) {
	    g.drawLine(0, 0, x, y);
	    x = x +100;
	    y = y - 60;
	    }
	}
	
	public static void main(String[] args) {
		Question2 canvas = new Question2();
		JFrame frame = new JFrame("Basic Lines");
		
		frame.add(canvas);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1400, 900);
		frame.setVisible(true);
	}
}