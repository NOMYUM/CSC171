import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

public class Question5 extends JComponent implements KeyListener, MouseListener {
	private static final long serialVersionUID = 1L;
	
	private int x;
	private int y;
	Character a;
	String b = "";
	Color color;

	public Question5() {
		addMouseListener(this);
		addKeyListener(this);
		setFocusable(true);
	}

	@Override
	public void keyTyped(KeyEvent k) {
		Graphics g = this.getGraphics();
		g.drawString(b, x, y);
		x = x + 10;
		a = k.getKeyChar();
		b = a.toString();
	}

	@Override
	public void keyPressed(KeyEvent k) {
	}

	@Override
	public void keyReleased(KeyEvent k) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	public static void main(String[] args) {
		JFrame frame5 = new JFrame();
		Question5 canvas5 = new Question5();
		frame5.add(canvas5);
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.setSize(600, 600);
		frame5.setVisible(true);
	}
}