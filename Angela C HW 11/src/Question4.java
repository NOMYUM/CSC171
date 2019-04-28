import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Question4 extends JComponent implements MouseListener, MouseMotionListener, KeyListener {
	private static final long serialVersionUID = 1L;

	public Question4() {
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	int q, k;
	int x1, y1 = 0;
	int x2, y2;
	public void paint(Graphics g) {
		super.paint(g);
		if (q != 0 && k != 0) {
			g.setColor(Color.black);
			g.fillOval(q, k, 50, 50);
			g.drawOval(q, k, 50, 50);
		}

		if (x1 != 0 && y1 != 0) {
			g.setColor(Color.black);
			g.drawLine(x1, y1, x2, y2);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		q = e.getX();
		k = e.getY();
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse entered " + e);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse Exited " + e);
	}

	@Override
	public void mousePressed(MouseEvent e) {

		System.out.println("Mouse Pressed" + e);
		x1 = e.getX();
		y1 = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse Released" + e);
		x1 = 0;
		y1 = 0;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		q = e.getX();
		k = e.getY();
		repaint();
		x2 = e.getX();
		y2 = e.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Check for key characters: " + e.getKeyChar());
	}

	public static void main(String[] args) {
		Question4 canvas = new Question4();
		JFrame frame = new JFrame();
		frame.setSize(600, 600);
		frame.add(canvas);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setFocusable(true);
	}

}
