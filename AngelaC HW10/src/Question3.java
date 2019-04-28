import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Question3 extends JComponent{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		g.setColor(Color.BLACK);
		int x = 0;
		int y = height;
	
	    while(x < 1400 && y > 0) {
	    g.drawLine(0, 0, x, y);
	    x = x +100;
	    y = y - 60;
	    }
	    
		g.drawLine(0, 0, width, 0);
		x = 0;
		y = 0;
		while(x < 1400 &&   y < 900 ) {
			g.drawLine(width, 0, x, y);
			x = x + 100;
			y = y  + 60;
			
		}
		x = 0;
		y = 0;
		while(x<1400 && y<900) {
			g.drawLine(0, height, x, y);
			x=x+100;
			y=y+60;
		}
		
		x=0;
		y=height;
		while(x<1400 && y>0) {
			g.drawLine(width, height, x, y);
			x= x+100;
			y= y-60;
		}
	}
	
	public static void main(String[] args) {
		Question3 canvas = new Question3();
		JFrame frame = new JFrame("Basic Lines");
		
		frame.add(canvas);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1400, 900);
		frame.setVisible(true);
	}
}